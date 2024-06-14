package Method;

public class MethodWithParameterWithoutReturnType {

	void test(int a, String b, char c) {
		System.out.println("print the test parametered variables:- ");
		System.out.println("int: " + a);
		System.out.println("String: " + b);
		System.out.println("char: " + c);
		System.out.println("==============================");
	}
	
	void count(int i,int j) {
		int k=i+j;
		System.out.println("print count :- "+ k);
	}

	public static void main(String[] args) {

		MethodWithParameterWithoutReturnType m = new MethodWithParameterWithoutReturnType();
		m.test(10, "noor", 'a');
		m.count(10,10);
	}
	
}
