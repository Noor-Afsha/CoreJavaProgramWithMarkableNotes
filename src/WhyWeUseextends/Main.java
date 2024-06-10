package WhyWeUseextends;

public class Main {

	public static void main(String[] args) {
		
		  Media media = new Media();
	        media.setId(1);
	        media.setTitle("Song Title");
	        
	        
	        Vedio v = new Vedio();
	        v.setId(2);
	        v.setTitle("Video Title");
	        v.setPalyVedio("Video");
	        v.setPauseVedio("1080p");
	        
	        
	        Audio a = new Audio();
	        a.setId(3);
	        a.setTitle("Audio Title");
	        a.setPlaySong("Audio Artist");
	        a.setPauseSong("pause");

	        // Printing the objects using toString() method
	        System.out.println(media);
	        System.out.println(v);
	        System.out.println(a);
	}
}
