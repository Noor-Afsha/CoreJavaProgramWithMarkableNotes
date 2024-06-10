package WhyWeUseImplementsKeyword;

public class Vedio implements Media {

	@Override
	public void play() {
		System.out.println("stop the vedio");

	}

	@Override
	public void pause() {
		System.out.println("paused the vedio");
	}

}
