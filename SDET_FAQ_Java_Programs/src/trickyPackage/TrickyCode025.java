/*
Q. What will happen when you compile and run the following code?
   Answer: 3
   1- 12
   2- 11
   3- 13
   4- 14
*/
package trickyPackage;

public class TrickyCode025 {

	public static void main(String[] args) {
		
		int i = 10;	
		i++; i++; ++i;
		int j = i++;
		System.out.println(j);

	}

}
