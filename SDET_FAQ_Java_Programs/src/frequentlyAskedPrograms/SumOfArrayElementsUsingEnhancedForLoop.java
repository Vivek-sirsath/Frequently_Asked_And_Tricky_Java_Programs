package frequentlyAskedPrograms;

public class SumOfArrayElementsUsingEnhancedForLoop {

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
