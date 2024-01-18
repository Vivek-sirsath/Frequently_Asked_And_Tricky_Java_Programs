/*
 * QualityKiosk Question
 * Q. What will be the output of the following code?
 * Answer: 24
 * */

package trickyPackage;

public class TrickyCode021 {
	
	static String str = "";

	public static void main(String[] args) {
		
		z:
		for(int x=2; x<7; x++) {
			if(x==3) continue;
			if(x==5) break z;
			str = str + x;
		}
		System.out.println(str);	// 24

	}

}

/*
Let's break down how the output "24" is obtained step by step:

1) Initialization:
   str is initially an empty string.
   
2) Loop Iterations:
   - When x is 2, it is concatenated to str. So, str becomes "2".
   - When x is 3, the continue statement is executed, skipping the current iteration. 
     Therefore, nothing is added to str in this iteration.
   - When x is 4, it is concatenated to str. So, str becomes "24".
   - When x is 5, the break z statement is executed, breaking out of the loop. 
     No further iterations occur.
3) Final Output:
   After the loop, the value of str is printed. 
   At this point, str is "24", 
   so the output of the program is: 24

*/