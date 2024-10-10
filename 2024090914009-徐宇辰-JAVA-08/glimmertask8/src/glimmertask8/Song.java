package glimmertask8;


public class Song extends Music{

	private String title;
	private String artist;
	private int bpm;
	
	public Song(String title,String artist,int bpm) {
		this.artist = artist;
		this.title = title;
		this.bpm = bpm;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getBpm() {
		return bpm;
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", bpm=" + bpm + "]";
	}

}

