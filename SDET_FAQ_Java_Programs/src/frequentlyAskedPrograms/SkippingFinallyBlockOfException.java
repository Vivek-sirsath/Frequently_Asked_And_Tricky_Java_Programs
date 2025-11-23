/*
 Q. How to skip finally block of exception even if exception occurs.
 Ans. To skip the execution of statements in finally block by aborting the code forcibly
      by writing the following line of code at the end of catch block. 
      
      System.exit{0); 
      
      We can abort any line by writing this code at any respective line.
  */

package frequentlyAskedPrograms;

public class SkippingFinallyBlockOfException {

	public static void main(String[] args) {
		
		int a=20;
		try 
		{
			
			System.out.println(a/0);
			
		}
		
		catch (ArithmeticException e) 
		{
			
			System.out.println(e.getMessage());     // / by zero
			System.exit(0);
		}		
		finally 
		{
			System.out.println("Finally will execute always");
		}

	}



}
