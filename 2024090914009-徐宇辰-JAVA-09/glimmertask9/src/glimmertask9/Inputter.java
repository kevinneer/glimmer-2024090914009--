package glimmertask9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Inputter {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ips = new ObjectInputStream(new FileInputStream("text.txt"));
			List<Song> songs = (List<Song>) ips.readObject();
			System.out.println("succeed");
		}catch(IOException | ClassNotFoundException e ){
			System.out.println("error");
		}
		
	}

}
