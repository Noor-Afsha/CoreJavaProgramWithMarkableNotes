package string;

public class CountVowelsOrConsonant {

	public static void main(String[] args) {
		String s = "hello";
		vowelsAndCOnsonant(s);

	}

	private static void vowelsAndCOnsonant(String s) {
		System.out.println("vowelsAndCOnsonant method executed");
		int vowels = 0, consonant = 0;

		s = s.toLowerCase();
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			} else if (c >= 'a' && c <= 'z') {
				consonant++;
			}
		}
		System.out.println("number of vowels:- " + vowels);
		System.out.println(" number of  consonant:- " + consonant);
	}

}
