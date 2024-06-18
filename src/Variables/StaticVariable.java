package Variables;
//class name
public class StaticVariable {
	
//static variables are written inside the class and outside the methods.
//Static varibles can accessed by its class name and object reference variables also.
//but accessing static variable through its class name is good practice......	
	
	static int a=10;//static variable
	static String name="noor";
	
	//method
	void test() {
		System.out.println("print value of a:- "+ a);
	}
	
	//main method
	public static void main(String[] args) {
		
		StaticVariable s=new StaticVariable();//creation of object
		
		System.out.println(StaticVariable.a);//accessing by class name, which is good practice.
		System.out.println(StaticVariable.name);
		System.out.println(s.a);//accessing by its object reference variable.
	}
}
