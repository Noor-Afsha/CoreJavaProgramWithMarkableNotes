package ThisKeyword;

public class Demo {
	// instance variable:-When it is inside the class and outside the method is
	// known as instance variable.
	int id;
	String name;

	// local variable because when it is inside the parameter and method or
	// constructor then it is called as local variable
	Demo(int id, String name) {
		this.id = id;
		this.name = name;
		this.show();
	}

	void show() {
		System.out.println("id:- " + id);// we are doing here concatinaton because we are adding string+integer.
		System.out.println("name:- " + name);
	}

	public static void main(String[] args) {
		Demo d = new Demo(10, "Noor");
//		d.show();

	}
	
	//NOTE:- here for the static block and static method this keyword is not working.
//	static void m1() {
//		this.show();
//	}
//	static {
//		this.show();
//	}
}
