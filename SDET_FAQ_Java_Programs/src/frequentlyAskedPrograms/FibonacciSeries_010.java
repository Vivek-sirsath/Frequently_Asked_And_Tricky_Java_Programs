
//Fibonacci Series Output: 0 1 1 2 3 5 8 13 21 34

package frequentlyAskedPrograms;

public class FibonacciSeries_010 {

	public static void main(String[] args) {
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+ " " +n2);  // 0 1
		
		for(int i = 2; i < 10; i++) {
			
			sum = n1+n2;  // 0+1=1, 1+1, 1+2, 2+3, 3+5, 5+8, 8+13, 13+21
			System.out.print(" " + sum); // 1 2 3 5	8 13 21	34		
			n1=n2; // 1  1  2  3  5  8  13
			n2=sum; //1  2  3  5  8  13 21 34
			
		}

	}

}
