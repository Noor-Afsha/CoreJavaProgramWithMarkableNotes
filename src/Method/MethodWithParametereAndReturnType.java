package Method;

public class MethodWithParametereAndReturnType {

	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		MethodWithParametereAndReturnType m = new MethodWithParametereAndReturnType();
		int value = m.add(10, 20);
		System.out.println("print value:- " + value);
	}
}
