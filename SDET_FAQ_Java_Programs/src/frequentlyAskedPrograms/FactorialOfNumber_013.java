
/*
 * Factorial is a function that multiplies a number by every number below it.
 * e.g.
 * 5! = 5*4*3*2*1 = 120
 * 
 * OR
 * 
 * 5! = 1*2*3*4*5 = 120
 *  
 */



package frequentlyAskedPrograms;

public class FactorialOfNumber_013 {

	public static void main(String[] args) {
		
		// 5! = 5*4*3*2*1 = 120
		
		int num = 5;
		long factorial = 1;
		
		// 1st WAY
		for(int i=num; i>=1; i--) {  // 5 4 3 2 1
			factorial = factorial * i;  // 5 20 60 120 120
		}
        System.out.println("Factorial of number by 1st WAY is: " + factorial);
        
        // 2nd WAY
        for (int i=1; i<=0; i++ ) { // 1 2 3 4 5
        	factorial = factorial*i; // 1*2*3*4*5
        }
        System.out.println("Factorial of number by 2nd WAY is: " + factorial);
	}

}
