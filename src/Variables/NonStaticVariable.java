package Variables;
//class name
public class NonStaticVariable {
//Non static variable are written inside the class and outside the method but without the static keyword is known as non-static variables.
//Non static variable can be accessed by its object referenced variable.
//Non static variable is also known as instance variable.	
	int a = 20;//non static variable

	//method
	void test() {
		System.out.println("print the non static value:- ");
	}

	//main method
	public static void main(String[] args) {

		NonStaticVariable n = new NonStaticVariable();// object creation with referenced value

		System.out.println("print non static value :- " + n.a);// accessing non-static variable by using object
																// reference varibale.
	}
}
