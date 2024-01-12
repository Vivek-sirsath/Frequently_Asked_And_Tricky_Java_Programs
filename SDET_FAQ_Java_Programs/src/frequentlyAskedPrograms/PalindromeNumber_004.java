package frequentlyAskedPrograms;

import java.util.Scanner;

public class PalindromeNumber_004 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();
		int orig_num = num;
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		if(orig_num==rev) {
			System.out.println(rev + " is Palindrome Number");
		}
		else {
			System.out.println(rev + " is not Palindrome Number");
		}
	}

}
