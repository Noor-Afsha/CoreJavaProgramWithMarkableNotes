package Method;

public class Student {

	//method without parameters
	void add() {
//variable initialization
		int a = 10, b = 20, c;
		c = a + b;
		System.out.println("print value of c:- " + c);
	}

	public static void main(String[] args) {
		//creation of object of its class.
		Student s = new Student();
		
		//calling a method by its referenced variable and getting proper output
		s.add();
		s.name();
		s.test();
	}
	String name() {
		 String name="noor";
		 System.out.println("print my name is :- "+ name);
		 return name;
	}
	char test() {
		char c='a';
		System.out.println("print char value:- "+ c);
		return c;
	}
	
}
