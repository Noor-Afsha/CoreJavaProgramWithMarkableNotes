package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethod {

	public static void main(String[] args) throws IOException {
		
		File f=new  File("C:\\Users\\noora\\Noor.txt");
		
		FileReader fr=new  FileReader(f);
		
		int i;
		
		while((i=fr.read()) !=-1) {
			System.out.print((char)i);
		}
		
	}
}
