
/*
Q. What should be the execution order, if a class has a method, static block,
   instance block and constructor as shown in the program.
   
   Answer :- Static Block >> Instance Block >> Constructor >> Method
*/

package trickyPackage;

public class First_C {

	public void myMethod() {
		System.out.println("Method");
	}

	{
		System.out.println("Instance Block");
	}

	public void First_C() {
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		
		First_C c = new First_C();
		c.First_C();
		c.myMethod();

	}

}
