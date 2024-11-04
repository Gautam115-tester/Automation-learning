package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		try {
			FileWriter myfiWriter = new FileWriter("abc.txt");  // file location
			myfiWriter.write("This is our first writing code in java by using FileWriter \nokay now bye ");
			myfiWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
