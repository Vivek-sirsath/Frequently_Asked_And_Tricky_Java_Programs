
// Q. How to remove white spaces from string using (RegExp) Regular Expression.

package frequentlyAskedPrograms;

public class removeWhiteSpacesFromString_025 {

	public static void main(String[] args) {

		String str = "Java    _ Selenium _   Automation";
		System.out.println("Before removing White Spaces:- " + str);
		String newStr = str.replaceAll("\\s", "");
		System.out.println("After removing White Spaces:- " + newStr);

	}

}
