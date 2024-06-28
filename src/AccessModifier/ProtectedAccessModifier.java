package AccessModifier;

public class ProtectedAccessModifier {

	protected int age;

	protected ProtectedAccessModifier(int i) {

	}

	protected void m1() {
		System.out.println("print m1 ");
	}

	public static void main(String[] args) {

		ProtectedAccessModifier p = new ProtectedAccessModifier(12);

		p.m1();
		System.out.println(p.age=10);
	}
}
