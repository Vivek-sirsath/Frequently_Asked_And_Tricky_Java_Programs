package frequentlyAskedPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArrayUsingInBuiltMethods_023 {

	public static void main(String[] args) {

		// Approach 1 - parallelSort()
		int a[] = { 3, 1, 2, 5, 4 };
		System.out.println("Array elements before sorting:" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("1. Array elements after sorting using parallelSort():" + Arrays.toString(a));

		// Approach 2 - sort()
		int b[] = { 33, 11, 22, 55, 44 };
		System.out.println("Array elements before sorting:" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("2. Array elements after sorting using sort():" + Arrays.toString(b));

		// Approach 3 - Descending order sorting
		// Here premitive dataType not supporting to (Collections.reverseOrder()) method
		// Then, we've to use derived class (Integer)
		Integer c[] = { 33, 11, 22, 55, 44 };
		System.out.println("Array elements before sorting:" + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("3. Array elements after reverseOrder:" + Arrays.toString(c));

	}

}
