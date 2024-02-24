
/*
Q. What will happen when you compile and run the following code
   with "java Test one two three" command?
   Answer: Output in console: 'one two three Exception Finally'
   
   To run the provided Java code with the command java Test one two three, you need to follow these steps:
   1. Save the Java code in a file named Test.java.
   2. Open a command prompt or terminal.
   3. Navigate to the directory where the Test.java file is saved.
   4. Compile the Java code by running the command: 'javac Test.java'
   5. After successfully compiling, run the compiled Java class with the command-line arguments:
      'java Test one two three'
      
    ### < Getting Error: Could not find or load main class Test > ###
      
*/

package trickyPackage;

public class TrickyCode031 {

	public static void main(String[] args) {

		try {
			for (int i = 0; i <= args.length; i++) {
				System.out.println(args[i] + " ");
			}
		} catch (Exception e) {
			System.out.print("Exception ");
		} finally {
			System.out.print("Finally ");
		}

	}

}
