package glimmertask8;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Song> songList = new ArrayList<Song>();
		ArrayList<? extends Music> musicList = new ArrayList<Music>();
		ArrayList<Game> gameList = new ArrayList<Game>();//因为Game不是Music的子类，所以不能将ArrayList<Game>赋给ArrayList<Music>
		
		Song song = new Song("first","MK",100);
		songList.add(song);
		
		System.out.println(song.getArtist());
		System.out.println(song.getBpm());
		System.out.println(song.getTitle());
		
		musicList = songList;
		//musicList = gameList;
		
		System.out.println(musicList);
		
	}

}
