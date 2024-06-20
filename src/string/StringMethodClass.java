package string;

public class StringMethodClass {

	public static void main(String[] args) {
		
		String s="aabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println("print the length of string:- "+ s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.codePointAt(1));//it will ascii value of alphabet letters, for lower and upper case value is different
	}
}
