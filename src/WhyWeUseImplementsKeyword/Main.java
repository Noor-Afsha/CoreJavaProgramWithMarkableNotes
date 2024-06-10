package WhyWeUseImplementsKeyword;

public class Main {

	public static void main(String[] args) {

		System.out.println("main method executed");

		Audio a = new Audio();
		a.play();
		a.pause();

		Vedio v = new Vedio();
		v.play();
		v.pause();

	}
}
