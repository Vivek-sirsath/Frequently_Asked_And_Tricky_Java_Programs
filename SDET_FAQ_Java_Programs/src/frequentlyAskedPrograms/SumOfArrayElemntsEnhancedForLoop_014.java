package frequentlyAskedPrograms;

public class SumOfArrayElemntsEnhancedForLoop_014 {

	public static void main(String[] args) {

		int[] a = { 5, 5, 5, 5, 5 };

		int sum = 0;

		// Enhanced for loop / for-each loop
		for (int element : a) {
			sum = sum + element;
		}
		System.out.println(sum);
	}

}
