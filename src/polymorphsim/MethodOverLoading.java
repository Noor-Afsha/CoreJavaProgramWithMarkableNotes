package polymorphsim;

public class MethodOverLoading {

	void m1() {
		System.out.println("m1 method executed");
	}
	void m1(int id) {
		System.out.println("m1 with one parameter:-"+ id);
	}
	int m1(int id, int price) {
		System.out.println("print m1 with two parameter");
		return 10;
	}
	public static void main(String[] args) {
		MethodOverLoading mm=new MethodOverLoading();
		mm.m1();
		mm.m1(10);
		mm.m1(10, 20);
	}
}
