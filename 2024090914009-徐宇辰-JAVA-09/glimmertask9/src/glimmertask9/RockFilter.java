package glimmertask9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RockFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Songs songList = new Songs();
		List<Song> songs = songList.getSongs();
		//songList.getSongs();不应该对这个作getSongs()，要实现的是一个Song对象的流，这样才能把genre作为标准进行筛选
		Stream<Song> stream = songs.stream().filter(song -> song.getGenre().contains("Rock"));
		List<Song> rockList = stream.collect(Collectors.toList());
		for (Song rockSong : rockList) {
			System.out.println(rockSong);
		}
	}

}
