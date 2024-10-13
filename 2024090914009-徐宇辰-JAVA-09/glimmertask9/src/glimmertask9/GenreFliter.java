package glimmertask9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenreFliter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Songs songList = new Songs();
		List<Song> songs = songList.getSongs();

		HashMap<Integer, String> genreMap = new HashMap<>();
		Set<String> filterGenres = new HashSet<>();
		int code = 1;
		for(Song song : songs) {
			String genre = song.getGenre();
			if(filterGenres.contains(genre)) {
			}else {
				genreMap.put(code++, genre);
				filterGenres.add(genre);
			}
		}
		
		genreMap.forEach((code1,genre)->System.out.println(code1+" "+genre));

	}
}