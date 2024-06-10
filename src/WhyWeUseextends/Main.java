package WhyWeUseextends;

public class Main {

	public static void main(String[] args) {
		
		//now in the Main class will create an object of every class and by using the reference variable, set its variable.
		//by using toString will print the method:-
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

//output is below:-

//Media [id=1, title=Song Title]
//Vedio [palyVedio=Video, pauseVedio=1080p]
//Audio [playSong=Audio Artist, pauseSong=pause]
