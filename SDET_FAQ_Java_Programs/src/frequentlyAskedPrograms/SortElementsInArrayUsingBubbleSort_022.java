package frequentlyAskedPrograms;

import java.util.Arrays;

public class SortElementsInArrayUsingBubbleSort_022 {

	public static void main(String[] args) {

		int a[] = { 403, 198, 654, 130, 512 };

		System.out.println("Array before sorting:" + Arrays.toString(a));

		int len = a.length;
		System.out.println("Length of an array: " + len);

		// Here if we have no. of elements in array 5
		// i.e. length = 5 then passes should be (len-1)

		for (int i = 0; i < len - 1; i++) { // No of passes

			for (int j = 0; j < len - 1; j++) {

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Array after sorting:" + Arrays.toString(a));
	}

}
