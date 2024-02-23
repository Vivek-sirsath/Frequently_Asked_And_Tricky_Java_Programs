
/*
Q. What will happen when you compile and run the following code?
   Answer: 2
*/

package trickyPackage;

public class TrickyCode026 {

	public static void main(String[] args) {

		int i = 0;
		int j = ++i + i++;
		System.out.println(j);

	}

}
