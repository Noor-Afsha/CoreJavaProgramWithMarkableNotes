package Inheritance.singleLevelInheritance;

public class B extends A{

	void talk() {
		System.out.println("talking talking.....");
	}
	public static void main(String[] args) {
		B b=new B();
		b.talk();
		b.play();
		b.stop();
	}
}
