package frequentlyAskedPrograms;

import java.util.Scanner;

public class FactorialOfNumber_CodeChef {

	public static void main(String[] args) {
				
        int N, factorial = 1; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");        
        N = sc.nextInt();  

        int i = 1;
        while (i <= N) {        
            factorial *= i;     
            ++i;
        }
        System.out.println(factorial);
        
        sc.close();
	}

}
