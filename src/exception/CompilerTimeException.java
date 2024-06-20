package exception;

public class CompilerTimeException {

	public static void main(String[] args) {

		System.out.println(
				"Compile time exception mean it will check the program while compiling ad catch the exbutception while compiling the program"
						+ "but every exception occurs at runtime .");

		// its not an error its a exception which compiler is checking while compiling
		// time the program and catch the exception

		// compile time exception we are handling it by using try and catch block....
		// Compile time exception occurs when it highly chances of getting failure then
		// t occurs.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("compile time exception:- " + e.getMessage());
		}
	}
}