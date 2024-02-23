
/* Q. What will happen when you compile and run the following code?
   Answer: 1
   1- Name is Test
   2- Name is TestObject
   3- Compilation Error
   4- None of the above
   
   > Here the variable 'name' is declared as static, Hence it will not require 
   object to print. We can call static variable directly in main method.
   As it is static, JVM will invoke it first while executing main method.
   
   > It will not print 'TestObject' unless we create the object of Test Class.
   Because, here the value of 'name' variable is reinitialized in the constructor.
   It only invokes when the object is created. Since the object is not creating here,
   So, the value of 'name' variable is remain as 'Test'
   
*/

package trickyPackage;

public class TrickyCode024 {

	static String name = "Test";

	public TrickyCode024() {

		name = "TestObject";

	}

	public static void main(String[] args) {

		System.out.println("Name is " + name);

	}

}
