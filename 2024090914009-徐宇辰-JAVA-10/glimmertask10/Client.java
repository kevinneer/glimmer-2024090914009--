package glimmertask10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Client {

	private SocketChannel socketChannel;
	
	public Client(String sAddress,int tcp) {
		try {
			InetSocketAddress serverAddress = new InetSocketAddress(sAddress,tcp);
			socketChannel = SocketChannel.open(serverAddress);
		}catch(IOException e){
			System.out.println("error");
		}
	}
	
	public String recieveMessage() throws IOException {
		Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
		BufferedReader bufferedreader = new BufferedReader(reader);
		String message = bufferedreader.readLine();
		return message;
	}
	
	public void sendMessage(String message) throws IOException {
		Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);
		PrintWriter printwriter = new PrintWriter(writer ,true);
		printwriter.println(message);
		printwriter.println("message to send");
		printwriter.print("another message");//题目好像打错了，应该是printwriter，题干给的writer
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Client client = new Client("196.164.1.103", 5000);
		client.sendMessage(null);
		client.recieveMessage();
	
		
		

	}
	
}

