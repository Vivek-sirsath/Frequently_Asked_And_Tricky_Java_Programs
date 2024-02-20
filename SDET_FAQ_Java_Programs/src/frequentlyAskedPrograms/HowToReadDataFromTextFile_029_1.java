package frequentlyAskedPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HowToReadDataFromTextFile_029_1 {

	public static void main(String[] args) throws IOException {

		// Approach 1 : Using FileReader and BufferedReader

		FileReader fr = new FileReader("E://EDUCATIONAL//ReadTextFileInJava.txt");
		// At this line exception coming : FileNotFoundException

		BufferedReader br = new BufferedReader(fr);

		String str;

		while ((str = br.readLine()) != null) { // IOException
			System.out.println(str);
		}

		br.close();
	}

}
