package Static;

public class Employee {

	int id;
	String name;
	double salary;
	static String companyName;// here company name and dressColor will common for every employee so we can
								// make it static.
	static String dressColor;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("ID :-"+ id);
		System.out.println("Name :-"+ name);
		System.out.println("Salary :-"+ salary);
		System.out.println("Compnay Name :-"+companyName);
		System.out.println("Dress Color :-"+ dressColor);
	}
	public static void main(String[] args) {
		
//		System.out.println("main method executed");
		
		Employee.companyName="Wecodee Innovation";
		Employee.dressColor="Yellow & Blue";
		
		Employee e=new Employee(1, "Noor", 1000000);
		e.display();
		
		System.out.println("============================");
		
		Employee e1=new Employee(12, "Noor", 1234000);
		e1.display();
		Employee.fun();
	}
	
	//methods can be static when no need to access the object
	//without creating of object we are printing
	static void fun() {
		System.out.println("===================================");
		System.out.println("no need to of object");
	}
	//inner class can be static 
	static class A{
		private void sysout() {
			
		}
	}
}
