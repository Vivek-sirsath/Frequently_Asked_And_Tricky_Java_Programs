
/*
Q. What will be the output of the following program ?
 
   Answer :- 25
   
   1. 24
   2. 23
   3. 20
   4. 25
*/

package trickyPackage;

public class TrickyCode034 {

	public static void main(String[] args) {

		int x = 3, y = 5, z = 10;
		
		System.out.println(++z+y-y+z+x++);

	}

}
