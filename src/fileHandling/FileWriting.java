package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) throws IOException {

//		FileWriter fw = null;
//		
//		try {
//			File f = new File("C:\\Users\\noora\\Noor.txt");
//
//			fw = new FileWriter(f, true);// after giving true here our previous data will be also stored
//											// other it will override the data.
//		} catch (IOException i) {
//			System.out.println(i.getMessage());
//		}
//		try {
//			fw.write("   Hellow World");
//		} catch (IOException i) {
//			System.out.println(i.getMessage());
//		} finally {
//			try {
//				fw.close();// to save the data
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//
//		System.out.println("Data written in the given file");

		File f = new File("C:\\Users\\noora\\Noor.txt");

		FileWriter fw = new FileWriter(f, true);

//		fw.write("   Hello World");//storing string value 

		// now integer value:-
		int a = 10, b = 30, c;
		c = a + b;

		fw.write(Integer.toString(c));// we are doing type casting Integer vlue to its string.when we are passing the
										// c variabe we were getting ascii value that why we change

		char cc[] = { 'n', 'o', 'o', 'r' };

		fw.write(cc);

		fw.close();// to save the data

		System.out.println("Data written in the given file");

	}

}
