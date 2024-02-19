package frequentlyAskedPrograms;

public class SumOfArrayElementsUsingForLoop_014_01 {

	public static void main(String[] args) {
		
		int a[] = {5,5,5,5,5};   // n-1=4
		
		int sum=0;
		
		for(int i = 0; i <= a.length-1; i++) {
			sum = sum+a[i];
		}
		
		System.out.println("Sum of Array Elements: " + sum);

	}

}
