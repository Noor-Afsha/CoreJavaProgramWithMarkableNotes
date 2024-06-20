package exception;

public class Demo {

	public static void main(String[] args) {
		
//		System.out.println("hi");
//		System.out.println("hello");
//		System.out.println(10/0);//here its compiling, but will get run time error that error is nothing but exception called arithmeticException.
//		//after this we have lots of code but that code is not executable on that time below code will not execute.
//		System.out.println("goodbye");
//		System.out.println("dfgh");
//		System.out.println("drtfygu");
		
		int arr[]=new int[3];
		arr[0]=100;
		arr[1]=110;
		arr[2]=123;
		arr[3]=1234;
		
		System.out.println("hiii");
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("print array:- "+ arr[i]);
//		}
		
//		int i=0;
//		do {
//			System.out.println("print do while loop");
//			i++;
//		}while(i<arr.length);
		
//		if(arr.length>0)arr[0]=100;
//		if(arr.length>0)arr[1]=200;
//		if(arr.length>0)arr[2]=300;
//		if(arr.length>0)arr[2]=400;

		int i=0;
		while(i<arr.length) {
			System.out.println(arr[3]);
			i++;
		}
	}
}
