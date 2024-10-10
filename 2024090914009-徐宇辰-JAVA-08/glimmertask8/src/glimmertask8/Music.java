package glimmertask8;

public class Music {

	private String title;
	private String artist;
	private int bpm;
	
	
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
		return "Music [title=" + title + ", artist=" + artist + ", bpm=" + bpm + "]";
	}
	
	
	
	
}
