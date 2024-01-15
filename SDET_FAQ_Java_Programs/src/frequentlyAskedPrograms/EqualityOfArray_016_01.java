package frequentlyAskedPrograms;

// Using equals() method of Arrays Class

import java.util.Arrays;

public class EqualityOfArray_016_01 {

	public static void main(String[] args) {
		
		int[] Array1 = {1,2,3,4,5};
		int[] Array2 = {1,2,3,4,5};
		
		
		boolean status = Arrays.equals(Array1, Array2);

		if(status==true) {
			System.out.println("Arrays are Equal");
		}else {
			System.out.println("Arrays are NOT Equal");
		}
		
	}

}
