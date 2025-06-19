
// Print powers of 2
// You have to print powers of 2 from 2 to 128 in separate lines using a while loop

package frequentlyAskedPrograms;

public class PrintThePowersOf2Till128 {

	public static void main(String[] args) {
		
		int a = 2;
		
		while (a <= 128) {
			System.out.println(a);
			a = a * 2;
		}

	}

}
