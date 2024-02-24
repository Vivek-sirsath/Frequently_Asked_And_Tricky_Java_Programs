
/*
   Q. What will happen when you compile and run the following code?
   Answer: output -1
   
   The % modulus operator returns the reminder of the division operation.
   If the first operand of the modulus operator is negative, the reminder is also negative.
   
   if i = -24, output => 0
   if i = -27, output => -3
   
*/

package trickyPackage;

public class TrickyCode027 {

	public static void main(String[] args) {

		int i = -21;
		int j = 4;

		System.out.println(i % j);

	}

}
