package Method;

public class MethodWithutParameterWithReturnType {

	int test() {
		int a = 110;
		return a;
	}

	public static void main(String[] args) {
		MethodWithutParameterWithReturnType m = new MethodWithutParameterWithReturnType();
		int value = m.test();
		System.out.println("print the value of return type int :-" + value);

	}
}
