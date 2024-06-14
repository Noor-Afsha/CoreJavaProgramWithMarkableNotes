package Constructor;

public class NonParameterosedConstructor {

	void add() {
		System.out.println("print the method ");
	}

	public NonParameterosedConstructor() {
		System.out.println("Constructor will automatically will called when object is being created");
	}

	public static void main(String[] args) {
		NonParameterosedConstructor m = new NonParameterosedConstructor();
		NonParameterosedConstructor m1 = new NonParameterosedConstructor();

		m.add();
		m.add();
		m.add();
		m.add();	
		
		m1.add();
	}

}
