package glimmertask9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.io.ObjectOutputStream;

public class Outputter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Songs songList = new Songs();
		List<Song> songs = songList.getSongs();
		try {
			ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("text.txt"));
			ops.writeObject(songs);
			System.out.println("succeed");
		}catch(IOException e) {
			System.out.println("Exception");
		}
		
	}

}
