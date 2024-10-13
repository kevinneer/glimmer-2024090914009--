package glimmertask9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteAFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Song newSong = new Song("new","new","new",1,1);
		
		try {
			ObjectInputStream ips = new ObjectInputStream(new FileInputStream("text.txt"));
			List<Song> songs = new ArrayList<>((List<Song>) ips.readObject());
			ips.close();
			System.out.println("succeed");
			
			songs.add(newSong);
		
			ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("text.txt")); 
			ops.writeObject(songs);
			ops.close();
			System.out.println("succeed");
		
			songs.forEach(song->System.out.println(song));
		}catch(IOException | ClassNotFoundException e ){
			System.out.println("error");
		}
		
		
	}

}
