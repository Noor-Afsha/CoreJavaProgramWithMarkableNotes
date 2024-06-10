package WhyWeUseImplementsKeyword;

public class Audio implements Media {

	@Override
	public void play() {
		System.out.println("music is playing");

	}

	@Override
	public void pause() {
		System.out.println("Paused the music");
	}

}
