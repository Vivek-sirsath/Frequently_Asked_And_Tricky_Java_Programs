package frequentlyAskedPrograms;

public class CountEvenAndOddDigits_007 {

	public static void main(String[] args) {
		
		int num = 12345;
		
		int even_count = 0;
		int odd_count = 0;
		
		while(num>0) {  // 12345 1234 123 12 1 0
			
			int rem = num%10; // This will give last digit // 5 4 3 2 0
			
			if(rem%2==0) {
				
				even_count++;  // 1 2
			}
			else {
				odd_count++; // 1 2 3
			}
			num=num/10;  // this will eliminate last digit  // 1234 123 12 1 0
		}
		
		System.out.println("Number of even digits: " + even_count);
		System.out.println("Number of odd digits: " + odd_count);

	}

}
