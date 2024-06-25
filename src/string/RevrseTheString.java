package string;

public class RevrseTheString {
	public static void main(String[] args) {
		String original = "HELLO";
		String reverse = new StringBuffer(original).reverse().toString();
		System.out.println("print original string:-" + original);
		System.out.println("print reverse string:- " + reverse);
	}

}
