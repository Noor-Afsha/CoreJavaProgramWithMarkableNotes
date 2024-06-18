package Inheritance.hierarichalInheritance;

public class C extends A{
	
	void sleep() {
		System.out.println("sleeping 8 hours i healthy");
	}
	public static void main(String[] args) {
		C c=new C();
		c.run();
		c.sleep();
	}

}
