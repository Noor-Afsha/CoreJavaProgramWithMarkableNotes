package Inheritance.hierarichalInheritance;

public class B extends A{
 void walk() {
	 System.out.println("walking in the morning");
 }
 public static void main(String[] args) {
	
	 B b=new B();
	 b.run();
	 b.walk();
}

}
