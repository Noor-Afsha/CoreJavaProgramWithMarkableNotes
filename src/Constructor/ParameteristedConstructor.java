package Constructor;

public class ParameteristedConstructor {

	ParameteristedConstructor(int a, int b){
		int c=a+b;
		System.out.println("parameterised constructor with two parameter:- "+ c);
	}

	ParameteristedConstructor(int a, int b, String d){
		int c=a+b;
		String s="afsha";
		System.out.println("parameterised constructor with two parameter:- "+ c);
		System.out.println("String :-"+ s);
	}
	
	public static void main(String[] args) {
		ParameteristedConstructor p=new ParameteristedConstructor(10, 20);
		ParameteristedConstructor p1=new ParameteristedConstructor(10, 20, "afsha");
	}
}
