package WhyWeUseMultipleinheritance;

public class MultiMedia implements Media, AdvancedPlayer {

	@Override
	public void play() {
		System.out.println("Multimedia is playing");

	}

	@Override
	public void pause() {
		System.out.println("multi media is paused");
	}

	@Override
	public void seek() {
		System.out.println("Multimedia is being seeked");
	}

	@Override
	public void fastFrward() {
		System.out.println("Multimedia is fastFarwaded");
	}
}
