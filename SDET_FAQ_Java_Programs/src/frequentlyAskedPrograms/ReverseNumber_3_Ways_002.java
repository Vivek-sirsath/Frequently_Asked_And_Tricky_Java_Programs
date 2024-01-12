package frequentlyAskedPrograms;

import java.util.Scanner;

public class ReverseNumber_3_Ways_002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");

		int num = sc.nextInt();  // 1234
		
		/* 1). Using algorithm (Modulus/Multiplication & Devision Operator)
		   Logic:-
		           1234%10 gives last digit as output, eliminates remaining digits == 4
		           1234/10 eliminates last digit, gives remaining digits as output == 123
		*/
		
		int rev = 0;
		
		while(num!=0) { // initially num=1234!=0 // 123!=0 // 12!=0 // 1!=0 // 0!=0(false)
			rev=rev*10 + num%10;  // 0*10+1234%10=4 // 4*10+123%10=40+3=43 // 43*10+12%10=430+2=432 // 432*10+1%10=4320+1=4321
			num=num/10;  // 1234/10=123 // 123/10=12 // 12/10=1 // 1/10=0
		}
		System.out.println("Reverse number using algorithm is: " + rev);

		
		// 2). Using StringBuffer Class
/*		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse number using StringBuffer is: " + rev);
*/		
		
	    // 3). Using StringBuilder Class
/*		StringBuilder sbl = new StringBuilder();
		sbl.append(num);    // sbl variable will have the value of num
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse number using StringBuilder is: " + rev);
		
*/
	}

}
