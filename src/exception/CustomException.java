package exception;

import java.util.Scanner;

public class CustomException {

	void checkAge() {

		int age;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age:- ");
		age = sc.nextInt();
//		try {
			if (age < 18) {
//				System.out.println("under age");
				throw new UnderAgeException("You are under age, you can not vote");
			} else {
				System.out.println("You can vote");
			}
//		} catch (UnderAgeException e) {
//			System.out.println(e.getMessage());
//		}
	}

	public static void main(String[] args) {
		CustomException c = new CustomException();
		c.checkAge();
	}

}
