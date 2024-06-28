package AccessModifier;

public class AccessingProtectedClassUsingSubClass extends ProtectedAccessModifier {

	protected AccessingProtectedClassUsingSubClass(int i) {
		super(i);
	}	

	public static void main(String[] args) {

		AccessingProtectedClassUsingSubClass a = new AccessingProtectedClassUsingSubClass(12);

		System.out.println(a.age = 100);
		a.m1();
	}
}
