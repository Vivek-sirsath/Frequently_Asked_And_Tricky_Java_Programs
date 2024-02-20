package frequentlyAskedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HowToReadDataFromTextFile_029_2 {

	public static void main(String[] args) throws FileNotFoundException {

		// Approach 2 : Using Scanner and File
		// Locate the Text file
		
		File file = new File("E://EDUCATIONAL//ReadTextFileInJava.txt");
		
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}
		
	}

}
