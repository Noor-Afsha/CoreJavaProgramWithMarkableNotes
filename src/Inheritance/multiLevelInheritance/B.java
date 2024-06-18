package Inheritance.multiLevelInheritance;

public class B extends A{
	void speak() {
		System.out.println("speak");
	}
	public static void main(String[] args) {
		B b=new B();
		b.speak();
		b.play();
		b.dance();
	}

}
