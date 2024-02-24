
/*
   Also see TrickyCode032, to know the difference.
   
   Q. What will happen when you compile and run the following code?
   Answer: Code will throw Assertion Error and print Finally when Executed.
   
   Output:-
   Finally Exception in thread "main" java.lang.AssertionError
	       at trickyPackage.TrickyCode028.method1(TrickyCode028.java:31)
	       at trickyPackage.TrickyCode028.main(TrickyCode028.java:19)
 
   Here, AssertionError(): Constructs an AssertionError with no detail message.  
*/

package trickyPackage;

public class TrickyCode028 {

	public static void main(String[] args) {
		
		try {
			
			TrickyCode028 tc = new TrickyCode028();
			tc.method1();
			
		} catch (Exception e) {
			System.out.print("Exception ");
		} finally {
			System.out.print("Finally ");
		}

	}
	
	public void method1() {
		
		throw new AssertionError();
	}

}
