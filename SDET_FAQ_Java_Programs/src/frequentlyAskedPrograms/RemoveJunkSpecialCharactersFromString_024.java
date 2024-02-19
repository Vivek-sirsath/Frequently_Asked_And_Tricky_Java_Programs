
// Q. How to remove junk/special characters 
// from string using (RegExp) Regular Expression.

package frequentlyAskedPrograms;

public class RemoveJunkSpecialCharactersFromString_024 {

	public static void main(String[] args) {

		String str = "$*#@!Java Selenium(##$%!~";
		System.out.println("Before removing Special Characters:- " + str);
		String newStr = str.replaceAll("[a-zA-Z0-9]", "");
//		String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		// Using char operator (^) this method also removes the white spaces
		// JavaSelenium
		System.out.println("After removing Special Characters:- " + newStr);

	}

}
