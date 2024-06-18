package Variables;

//class name
public class LocalVariable {

//Local variable is created inside the method, method parameter, constructor and constructor parameter is known as local variable.
//Local variable can accessed by its method name or constructor name .

	// constructor
	LocalVariable() {
		int a = 10;
		System.out.println(a);//accesing by its constructor
	}

	// method
	void test() {
		int b = 20;
		System.out.println(b);
	}

	public static void main(String[] args) {

		LocalVariable l = new LocalVariable();
		l.test();//accessing by its method
	}
}
