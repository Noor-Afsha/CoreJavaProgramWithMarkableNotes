package javaProgramFromStarting;

public class InstanceBlock {

	//Here in instance block we can call a static method, non-static method,  static block and non-static block..
	//and instance block will execute before the constructor.
	
	//here we can see....
	
	
	//lets initialized some variables and try to call in insatnce block
	
	
	int a=10;//instance block
	
	static String name="noor";//static block
	
	void m1() {
		
	}
	
	//constructor
	public InstanceBlock(){
		
		System.out.println("Constructor is created");
	}
	 
	//Insatnce block
	{
		//but in instance block we can call both the static and instance block, method, variables etc.
		a=20;
		name="afsha";
		m1();
		System.out.println("Insatnce block executed before the constructor.");
	}
	
	//static block:-
	static {
		//here in static block we can call the instance variables.
//		a=30;
//		m1();
		name="khatoon"; //here in static block only static method or static variable we can access.not a instance block or variable.
	}
	public static void main(String[] args) {
		
		InstanceBlock ib=new InstanceBlock();

		System.out.println("Without main method not a single program will execute");
	}
}
