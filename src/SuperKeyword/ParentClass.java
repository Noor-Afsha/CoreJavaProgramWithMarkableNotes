package SuperKeyword;

public class ParentClass {

	static int id=10;
	String name;
	
	static void m1() {
		System.out.println("static method accessed by class name");
	}
	
	void show() {
		System.out.println("Id:- "+ id);
		System.out.println("Name:- "+ name);
	}
}
