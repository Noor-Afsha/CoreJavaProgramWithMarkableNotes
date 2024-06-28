package AccessModifier;

public class Student {

	public static void main(String[] args) {

		Employee e = new Employee(10);

		DefaultAccessModifier d1 = new DefaultAccessModifier(12);
		d1.m1();
		System.out.println(d1.id);

		e.add();
		System.out.println("print value of a:-" + e.a);

	}

}