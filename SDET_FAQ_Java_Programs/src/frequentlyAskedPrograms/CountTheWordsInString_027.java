package frequentlyAskedPrograms;

import java.util.Scanner;

public class CountTheWordsInString_027 {

	public static void main(String[] args) {

		System.out.println("Enter the String:");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int count = 1;
		
		// length() method count the characters from 1
		// charAt() method count the characters from 0

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println("Total No. of Words = " + count);

	}

}
