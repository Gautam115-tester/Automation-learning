package filehandling;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		
		File oldname = new File("abc.txt");
		File newname = new File("xyz.txt");
		
		if (oldname.exists()) {
			System.out.println(oldname.renameTo(newname));
		} else {
			System.out.println("File doesn't exists...!");
		}

	}

}
