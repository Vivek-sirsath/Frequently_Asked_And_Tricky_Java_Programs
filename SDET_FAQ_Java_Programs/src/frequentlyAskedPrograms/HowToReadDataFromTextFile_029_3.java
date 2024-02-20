package frequentlyAskedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HowToReadDataFromTextFile_029_3 {

	public static void main(String[] args) throws FileNotFoundException {

		// Approach 3 : Using Regular Expression and useDelimeter()
		// Locate the Text file

		File file = new File("E://EDUCATIONAL//ReadTextFileInJava.txt");

		Scanner sc = new Scanner(file);

		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

}
