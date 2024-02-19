package frequentlyAskedPrograms;

/*
Condition:
	1. Array should not have duplicates
	2. Array No need to be in sorted order
	3. Values should be in Range
	4. We should know the range
	
Algorithm:
	1. sum1 = 1+2+4+5 = 12
	2. sum2 = 1+2+3+4+5 = 15
	missingNumber = sum2 - sum1 = 15-12 = 3 is Missing Number
*/
public class FindMissingNumberInArray_017 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,8,9};
		
		int sum1 = 0;
		
		// Index wise addition of Array Elements
		for(int i = 0; i<a.length; i++) {
			sum1 = sum1 + a[i];
		}
		
		System.out.println("Sum of elements in Array: " + sum1);
		
		int sum2 = 0;
		
		// Numerical range wise addition
		// int i = 1 instead of 0 because, Not adding index wise 
		for(int i = 1; i<=a.length+1; i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println("Sum of elements between the range: " + sum2);
		
		System.out.println("Missing Number: " + (sum2-sum1));

	}

}
