package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		
		FileInputStream r = new FileInputStream("xyz.txt");
		FileOutputStream w = new FileOutputStream("abc.txt");
		
		int i;
		while ((i=r.read())!=-1) {
			w.write((char)i);
		}
		System.out.println("Data copied successfully...!");

	}                                                                              

}
