package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {
	public static void main(String[] args) {
		
		// code to create a new file.
		/*
		File myfile = new File("abc.txt");
		try {
			myfile.createNewFile();
		} catch (Exception e) {
			System.out.println("unable to create a file");
		}
		*/
		
		// code to write to a file
		
	/*	try {
			FileWriter myfiWriter = new FileWriter("abc.txt");  // file location
			myfiWriter.write("This is our first writing code in java by using FileWriter \n okay now bye ");
			myfiWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(e);
		}
		*/
		
		
		// code to read to a file
		/*
		File myfile = new File("xyz.txt");
		try {
			Scanner sc = new Scanner(myfile);
			while (sc.hasNextLine()) {
				String string = sc.nextLine();
				System.out.println(string);
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		*/
		
		// code to delete a file
		File myfile = new File("xyz.txt");
		if (myfile.abs) {
			System.out.println("I have deleted : "+myfile.getName());
		}else {
			System.out.println("Some problem occured while deleting the file");
		}

	}

}
