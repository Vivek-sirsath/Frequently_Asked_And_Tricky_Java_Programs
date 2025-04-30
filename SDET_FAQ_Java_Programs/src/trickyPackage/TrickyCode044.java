
/*
Q. What will be the output of the following code ?
 
   Answer :- Child class method
   
   1. Parent class method
   2. Child class method
   3. Compile-time error
   4. Runtime Exception
*/

package trickyPackage;

class Parent {

	public void display() {
		System.out.println("Parent class method");
	}

}

class Child extends Parent {
	@Override
	public void display() {
		System.out.println("Child class method");
	}
}

public class TrickyCode044 {

	public static void main(String[] args) {

		Parent obj = new Child();
		obj.display(); // Child class method

	}

}
