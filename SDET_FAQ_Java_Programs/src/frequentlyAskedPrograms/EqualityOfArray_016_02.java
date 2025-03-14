package frequentlyAskedPrograms;

// Without using equals() method of Arrays Class

public class EqualityOfArray_016_02 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 1, 2, 3, 4, 5 };

		boolean status = true;
		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					status = false;
				}
			}

		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are NOT Equal");
		}

	}

}
