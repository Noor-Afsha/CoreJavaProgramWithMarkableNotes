package WhyWeUseMultipleinheritance;

public class Main {
	public static void main(String[] args) {
		System.out.println("Main method executed");
		
		MultiMedia mm=new MultiMedia();
		mm.play();
		mm.pause();
		mm.seek();
		mm.fastFrward();
	}
}


