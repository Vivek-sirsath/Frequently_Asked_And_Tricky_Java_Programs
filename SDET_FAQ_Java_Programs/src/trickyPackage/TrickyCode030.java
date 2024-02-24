
/*
   Q. What will happen when you compile and run the following code?
   Answer: 0 in console
   
   > In main() method we've created an anonymous object of TrickyCode030 Class
     and it invokes the print method of the same class  in single statement.
     So, in single statement we can create object and invoke the methods of that class.
   > In Java, instance variables (fields) are automatically initialized 
     with a default value if no explicit initialization is provided.
   > Default value for integers, which is 0.
   > In the main method, an instance of TrickyCode030 is created using new TrickyCode030() and 
     then print() method is called on it, resulting in the output of 0 to the console.
*/

package trickyPackage;

public class TrickyCode030 {

	int i;

	void print() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		new TrickyCode030().print();
	}

}
