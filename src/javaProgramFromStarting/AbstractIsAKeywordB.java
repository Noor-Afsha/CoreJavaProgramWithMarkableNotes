package javaProgramFromStarting;

public class AbstractIsAKeywordB extends AbstractIsAKeywordA{

	@Override
	void add() {
		System.out.println("method add is execited ,calling abstract class A in Class B");
	}

	public static void main(String[] args) {
		AbstractIsAKeywordB b=new AbstractIsAKeywordB();
		b.add();
		b.substract();
		System.out.println("main method executed");
	}

	@Override
	void substract() {
	System.out.println("Substract method executed");
	}
}
