package frequentlyAskedPrograms;

import java.util.Scanner;

public class PalindromeString_005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str = sc.next();
		String orig_str = str;
		
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(orig_str.equalsIgnoreCase(rev)) {
			System.out.println(rev + " is Palindrome String");
		}else {
			System.out.println(rev + " is Not Palindrome String");
		}

	}

}
