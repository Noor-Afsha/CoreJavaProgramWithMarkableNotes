package WhyWeUseextends;

public class Audio extends Media{
	
	private String playSong;
	private String pauseSong;
	
	public String getPlaySong() {
		return playSong;
	}
	public void setPlaySong(String playSong) {
		this.playSong = playSong;
	}
	public String getPauseSong() {
		return pauseSong;
	}
	public void setPauseSong(String pauseSong) {
		this.pauseSong = pauseSong;
	}
	@Override
	public String toString() {
		return "Audio [playSong=" + playSong + ", pauseSong=" + pauseSong + "]";
	}
	
}
