package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		
		try {
			FileReader r = new FileReader("abc.txt");
			try {
				int i;
				while ((i=r.read())!=-1) {
					System.out.print((char)i);
				}
			} finally {
				r.close();
			}
		} catch (IOException e) {
			System.out.println("Exception handle..!");
		}

	}

}
