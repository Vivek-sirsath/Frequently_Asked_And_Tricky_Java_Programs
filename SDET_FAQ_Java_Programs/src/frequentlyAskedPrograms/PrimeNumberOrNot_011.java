
/*
 * 1. Natural Number > 1
 * 2. Which has only 2 fators - 1 and itself
 * 
 * e.g.
 * 19 -> 1 and 19 -> Prime Number
 * 28 -> 1,2,4,7,14,28  -> Not a Prime Number
 * 
 * e.g.
 * Prime Numbers: 1,3,5,7,11,13,17
 * 
 */


package frequentlyAskedPrograms;

public class PrimeNumberOrNot_011 {

	public static void main(String[] args) {
		
		int num = 5;
		int count = 0;
		
		if (num>1) {
			
			for(int i =1; i<=num; i++) {
				
				if(num%i==0) 
					count++;	
			}
			if (count==2) {
				System.out.println(num + " is Prime Number");
			}
			else {
				System.out.println(num + " is Not Prime Number");
			}
			
		}
		else {
			System.out.println("Number is not Palindrome number");
		}

	}

}
