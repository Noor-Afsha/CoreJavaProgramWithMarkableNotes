package fileHandling;

import java.io.File;

public class DemoFile {

	public static void main(String[] args) throws Exception {
//this is for create new file
//		File f = new File("C:\\Users\\noora\\Noor.txt");
//		f.createNewFile();
//		System.out.println("create new file");
		
		
		//check whether your file is created or not?
		File f1=new File("C:\\Users\\noora\\Noor1.txt");
		if(f1.createNewFile()) {
			System.out.println("create new file");
		}else {
			System.out.println("file already exits");
		}
	}
}
