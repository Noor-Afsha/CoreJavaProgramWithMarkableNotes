package exception;

public class Exceptions {

	void fun() {

		System.out.println("fun is fun");
	}

	int[] play() {

		int array[] = { 10, 20, 30 };

		return array;
	}

	public static void main(String[] args) {

		Exceptions e = new Exceptions();

		e.fun();

		int[] value = e.play();

		try {

			for (int i = 0; i <= 3; i++) {
				System.out.println(value[i]);

			}

		} catch (Exception e2) {

			System.out.println(e2.getMessage() + "Check the array index you have exceed the array range");
		}

	}
}
