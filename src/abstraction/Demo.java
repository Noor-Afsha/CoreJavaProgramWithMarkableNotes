package abstraction;

abstract class Demo {

	abstract void m1();

	abstract void m2();

	static String test() {
		System.out.println("print the static method");
		return "noor";
	}

	static void exam() {
		System.out.println("exam will return nothing");
	}

	int fun() {
		System.out.println("it will return the value for the integer type");
		return 10;
	}
	void play() {
		
	}

}
