package abstraction;

public class Student extends Demo {

	@Override
	void m1() {
		System.out.println("m1 is executed");
	}

	@Override
	void m2() {
		System.out.println("m2 is executed");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.m1();
		s.m2();
		s.test();
		s.exam();
		s.fun();
		s.play();
	}

}
