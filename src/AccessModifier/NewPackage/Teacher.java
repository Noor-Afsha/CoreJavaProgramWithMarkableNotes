package AccessModifier.NewPackage;

import AccessModifier.Employee;

public class Teacher {

	public static void main(String[] args) {
			
		Employee e=new Employee(10);
		System.out.println("Main method executed:-" +e.a);
		e.add();
		
	}
}
