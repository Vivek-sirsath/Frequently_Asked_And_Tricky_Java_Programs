
/*
   Also see TrickyCode028, to know the difference.
   
   Q. What will happen when you compile and run the following code?
   Answer: Code will throw Assertion Error and print Finally when Executed.
   
   Output:- In console, 'Exception Finally' 
 
   > Here, RuntimeException class is a subclass of the Exception class, 
     and can be caught like any other exceptions.
   > Since, the code has catch block for the Exception class, 
     RuntimeException is caught there and print "Exception "
   > There is also a finally block, which will be executed after it,
     and will print "Finally "
   
*/

package trickyPackage;

public class TrickyCode032 {

	public static void main(String[] args) {

		try {

			TrickyCode032 tc = new TrickyCode032();
			tc.method1();

		} catch (Exception e) {
			System.out.print("Exception ");
		} finally {
			System.out.print("Finally ");
		}

	}

	public void method1() {

		throw new RuntimeException();
	}

}
