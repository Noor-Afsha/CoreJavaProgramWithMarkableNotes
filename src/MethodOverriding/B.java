package MethodOverriding;

public class B extends A{

	String  m1() {
		System.out.println("m1 is not executing");
		System.out.println("now i have no friend");
		return "noor";
	}
	public static void main(String[] args) {
		 B b=new B();
		 b.m1();
	}
}
