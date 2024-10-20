package glimmertaskServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SimpleChatClientA {
	
	private PrintWriter writer;
	private BufferedReader reader;
	
    public static void main(String[] args) {
    	new SimpleChatClientA().go();
	}
	
    public void go() {
		setUpNetworking();
		sendMessage();
    } 
    private void setUpNetworking(){
    // open a SocketChannel to the server
    	try {
			Socket socket = new Socket("localhost",5000);
			// make a PrintWriter and assign to writer instance variable
	    	writer = new PrintWriter(socket.getOutputStream(),true);
	    	reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    	new Thread(()->{
				try {
					getMessage();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}).start();
	    	new Thread(()->{
	    		String message;
				try {
					message = reader.readLine();
				
		    		while(message!=null) {
		    			System.out.println(message);
		    			message=reader.readLine();
		    		}
	    		} catch (IOException e) {
					e.printStackTrace();
				}
	    	}).start();
	    	
	    	System.out.println("connected,please type your message below:");
	    	
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error");
		}
    
    } 
    
    private void sendMessage() {
		// send it to the server using the writer (a PrintWriter)
    	Scanner in = new Scanner(System.in);
        while (true) {
            String message = in.nextLine();
            writer.println(message);
        }
    }
    
    private void getMessage() throws IOException {
    	String message = reader.readLine();
    	while(message!=null) {
    		System.out.println(message);
    		message = reader.readLine();
    	}
    }
    
}

