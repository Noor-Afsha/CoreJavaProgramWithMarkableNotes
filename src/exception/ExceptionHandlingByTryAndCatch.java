package exception;

public class ExceptionHandlingByTryAndCatch {

	public static void main(String[] args) {
//
//		int arr[] = new int[3];
//		arr[0] = 100;
//		arr[1] = 200;
//		arr[2] = 300;
//
//		try {
//			arr[3] = 300;
//
//		} catch (Exception e) {
//			System.out.println("give the proper index value:- " + e.getMessage());
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//
//		}
//	}
	try {
	int arr[] = new int[3];
	arr[0] = 100;
	arr[1] = 200;
	arr[2] = 300;
	arr[3] = 300;
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);

	}
	} catch (Exception e) {
		System.out.println("We can give custom exception :- "+e.getMessage());
	}
	

}}
