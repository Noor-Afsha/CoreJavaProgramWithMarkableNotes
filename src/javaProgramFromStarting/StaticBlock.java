package javaProgramFromStarting;

public class StaticBlock {
	
	//what is static block?
		//1.Static block deals with class..
		//2.Static block will execute when .class file is loaded in the memory..
		//3.Static block will execute before the main method, but without main method static block will not execute.
		
		//Note:-As shown in below program:-
	
	public static void main(String[] args) {
		System.out.println("But without main method static block will not execute after the version of jdbc 1.6");
	}
	static {
		System.out.println("Static block will always execute before the main method");
	}
	
	
	
	

}
