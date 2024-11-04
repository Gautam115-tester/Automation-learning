package filehandling;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		
		File f = new File("abc.txt");
		
		if (f.exists()) {
			System.out.println("File name : "+f.getName());
			System.out.println("File location : "+f.getAbsolutePath());
			System.out.println("File writable : "+f.canWrite());
			System.out.println("File readable : "+f.canRead());
			System.out.println("File size : "+f.length()+" Byte");
		} else {
			System.out.println("File doesn't Exists");

		}

	}

}
