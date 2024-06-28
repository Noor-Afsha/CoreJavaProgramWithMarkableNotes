package AccessModifier;

public class DefaultAccessModifier {

//default variable
	int id = 10;

	// default constructor
	public DefaultAccessModifier(int i) {

	}

	void m1() {
		System.out.println("print m1");
	}

	public static void main(String[] args) {

		DefaultAccessModifier d = new DefaultAccessModifier(20);
		System.out.println(d.id);
		d.m1();
	}
}
