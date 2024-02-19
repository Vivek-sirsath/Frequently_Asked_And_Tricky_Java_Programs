
// Count Occurrence Of Character In String using Regular Expression

package frequentlyAskedPrograms;

public class CountOccurrenceOfCharacterInString_026 {

	public static void main(String[] args) {

		String str = "Java Is Object Oriented Programming Language";

		int ttlCount = str.length();
		int countAfterRemoving_char_a = str.replaceAll("a", "").length();

		int occurrence = ttlCount - countAfterRemoving_char_a;
		System.out.println("Occurrence of char 'a' in string is:- " + occurrence);

	}

}
