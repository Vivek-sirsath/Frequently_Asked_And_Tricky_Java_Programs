package frequentlyAskedPrograms;

public class MaxMinElementsInArray_018 {

	public static void main(String[] args) {

		int[] a = { 50, 100, 20, 40, 60 };

		int max = a[0]; // 50 (Initialize with first index)

		// Index wise for loop
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Max value of element in array: " + max);

		int min = a[0]; // 50 (Initialize with first index)

		// Index wise for loop
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min value of element in array: " + min);
	}
}
