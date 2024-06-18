package SuperKeyword;

public class ChildClass extends ParentClass{

	int id;
	String name;
	
	void set() {
		//Accessing the parent class instance members
		super.id=100;// parentClass
		super.name="noor";//ParentClass
		
		//Accessing the current class instance members
		this.id=10;
		this.name="afsha";
		
		//accessing the static variables by class name
//		ParentClass.id=10;
		ParentClass.m1();
		
		super.show();
	}
	//main method
	public static void main(String[] args) {
		
		ChildClass cc=new ChildClass();
		
		cc.set();
	}
}
