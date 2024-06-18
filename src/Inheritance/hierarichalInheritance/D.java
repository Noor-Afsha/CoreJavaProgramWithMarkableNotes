package Inheritance.hierarichalInheritance;

public class D extends A{

	void cry() {
		System.out.println("Small baby start crying");
	}
	public static void main(String[] args) {
		D d=new D();
		d.run();
		d.cry();
	}
}
