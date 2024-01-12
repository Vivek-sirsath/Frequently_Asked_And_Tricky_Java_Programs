package frequentlyAskedPrograms;

public class CountNumberOfDigitsInNumber_006_02 {

	public static void main(String[] args) {
	
		int num = 123456;
		
		int count = 0;
		
		while(num>0) {  // Here we need to set degug points
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in a number: " + count);
	}

}
