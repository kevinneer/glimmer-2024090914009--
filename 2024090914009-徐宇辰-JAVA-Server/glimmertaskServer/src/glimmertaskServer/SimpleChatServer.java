package glimmertaskServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class SimpleChatServer {

	private final List<PrintWriter> clientWriters = new ArrayList<>();
	private ServerSocket serverSocket;
    
    public void go() {
	 //将服务器运行起来
    	try {
			serverSocket = new ServerSocket(5000);
			System.out.println("launching···");
			//循环来接收客户端连接
			while (true) {
				Socket clientSocket = serverSocket.accept();//接收客户端连接
				new Thread(new ClientHandler(clientSocket)).start();//打开一个新的线程给ClientHandler
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    private void tellEveryone(String message) {
	 //将消息打印出来
    	for(PrintWriter writer : clientWriters){
    		writer.println(message);
    		writer.flush();
    	}
    }
   
    public class ClientHandler implements Runnable {
    	
    	private Socket clientSocket;
    	private BufferedReader reader;
    	private PrintWriter writer;
    	
    	public ClientHandler(Socket socket) {
    		this.clientSocket = socket;
    	}
    	
    	@Override
    	public void run(){
    		try {
    			reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//输入流
    			writer = new PrintWriter(clientSocket.getOutputStream());//输出流
    			clientWriters.add(writer);
    			String message;
				while ((message = reader.readLine()) != null) {
					tellEveryone(message);
					System.out.println(message);
    			}
    		} catch (IOException e) {
    			e.printStackTrace();
    		}finally {
    			clientWriters.remove(writer);
    			try {
					clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

    		}
    	}
    	
     //定义一个控制类
    }
    public static void main(String[] args) {
        SimpleChatServer SCS = new SimpleChatServer();
        SCS.go();
    }
}
