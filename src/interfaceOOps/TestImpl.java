package interfaceOOps;

public class TestImpl implements Test {

	@Override
	public void m1() {
		System.out.println("hii");

	}

	@Override
	public void fun() {
		System.out.println("hellow");
	}

	public static void main(String[] args) {
		TestImpl t = new TestImpl();

		t.m1();
		t.fun();

		System.out.println(Test.a);
		System.out.println(Test.b);
		System.out.println(Test.c);
	}
}
