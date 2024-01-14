package frequentlyAskedPrograms;

public class PrintEvenAndOddNumbersOfArray_015 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		
        // Using for loop
		System.out.println("***** Using For Loop *****");
		
		System.out.println("Even Numbers in Array:");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}

		}
		System.out.println(); // This will shift the control to the next line

		System.out.println("Odd Numbers in Array:");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
			
		}
		System.out.println(); // This will shift the control to the next line
		
		// Using for-each loop
		System.out.println("***** Using For-Each Loop *****");
		
		System.out.println("Even Numbers in Array:");
		for(int val:a){
			if(val%2==0) {
				System.out.print(val + " ");
			}
		}
		System.out.println(); // This will shift the control to the next line
		
		System.out.println("Odd Numbers in Array:");
		for(int val:a){
			if(val%2!=0) {
				System.out.print(val + " ");
			}
		}
		
		
	}

}
