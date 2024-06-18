package Inheritance.multiLevelInheritance;

public class C extends B{

	void laugh() {
		System.out.println("laughing is good for health");
	}
	public static void main(String[] args) {
		C c=new C();
		c.laugh();
		c.play();
		c.dance();
		c.speak();
	}
}
