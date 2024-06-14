package ControlFLow;

public class NestedIf {
	public static void main(String[] args) {

//		int a = 100, b = 200, c = 30;
//
//		if (a > b) {
//			if (b < c) {
//				System.out.println("a is greater than c ");
//			} else {
//				System.out.println("c is greate");
//			}
//		}
//			else {
//				if(b>c) {
//					System.out.println("b is greater");
//			}
//				else {
//					System.out.println("c is greater");
//				}
//		}

		String name = "Noor";
		boolean javaDeveloper = false;
		boolean javaTrainer = false;

		if (name.equals("noor")) {

			if (javaDeveloper) {
				System.out.println(name + " :- Is java developer");
			} else if (javaTrainer) {
				System.out.println(name + " :- Is a java Trainer");
			} else {
				System.out.println(name + " :- is nor java developer or java trainer ");
			}
		} else if (name.equals("Afsha")) {

			if (javaDeveloper) {
				System.out.println(name + " :- is a java developer");
			} else if (javaTrainer) {
				System.out.println(name + " :- is a java trainer");
			} else {
				System.out.println(name + " :- nor a developer or trainer");
			}
		}
		else {
			System.out.println("Unknown person");
		}

	}

}
