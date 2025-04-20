
/*
Q. What will be the result of the following program ?
 
   Answer :- Performing action
   
   1. Performing action
   2. Compilation error
   3. Runtime exception
   4. No output
*/

package trickyPackage;

interface MyInterface {
	void perform();
}

class MyImplementation implements MyInterface {

	public void perform() {
		System.out.println("Performing action");
	}
}

public class TrickyCode037 {

	public static void main(String[] args) {

		MyInterface obj = new MyImplementation();
		obj.perform();

	}

}
