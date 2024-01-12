package frequentlyAskedPrograms;

public class SumOfAllDigitsInNumber_008 {

	public static void main(String[] args) {
		
		int num  = 12345;
		
		int sum = 0;
		
		while(num>0) {  // 12345  1234  123  12  1
			
			sum = sum + num%10; // This will return last digit and add to initial sum variable // 0+5+4+3+2+1
			num = num/10; // This will eliminate the last digit // 1234  123  12  1  0
		}
        
		System.out.println("Sum of all digits in number: " + sum);
	}

}
