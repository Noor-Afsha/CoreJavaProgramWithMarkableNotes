package AccessModifier;

public class PrivateAccessModifier {

	private int age=10;
	
	private PrivateAccessModifier(int i) {
		
	}
	private void m1() {
		System.out.println("print m1");
	}
	public static void main(String[] args) {
		
		PrivateAccessModifier p=new PrivateAccessModifier(100);
		System.out.println(p.age);
		p.m1();
		
	}
	
	//inner class
		private class A{
			
	}
}
