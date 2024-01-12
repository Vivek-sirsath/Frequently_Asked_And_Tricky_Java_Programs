package frequentlyAskedPrograms;

public class Swap_2_Numbers_5_Ways_001 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before Swapping: " + a + " " + b);
		
		// Logic 1 - Using 3rd variable
/*		int t=a;
		a=b;
		b=t;
*/
		
		// Logic 2 - Using arithmetic operators + & -, without 3rd variable
/*		a=a+b;  // 10+20=30
		b=a-b;  // 30-20=10
		a=a-b;  // 30-10=20
*/	
		
		// Logic 3 - Using * & /, without 3rd variable
		// here a & b values should not be zero
/*		a=a*b;   // 10*20=200
		b=a/b;   // 200/20=10
		a=a/b;   // 200/10=20
*/
		
		// Logic 4 - Using XOR (^) (Caret Operator)
/*		a=a^b;
		b=a^b;
		a=a^b;
*/
		
		// Logic 5 - Single Statement
		//  a=10,  b=20
		// Here execution will start from right to left
		b=a+b-(a=b);
		
		System.out.println("After Swapping: " + a + " " + b);
		
	}
}
