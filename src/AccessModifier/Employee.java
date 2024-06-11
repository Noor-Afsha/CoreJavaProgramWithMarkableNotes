package AccessModifier;

public class Employee {

	//variable as a public 
	public int a=10;
	public String name="noor";
	
	//constructor as a public
	public Employee(int i){
		
	}
	
	//method as public 
	public void add() {
		System.out.println("add method executed");
		
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		
		System.out.println("Main method executed....");
		
	}
}
