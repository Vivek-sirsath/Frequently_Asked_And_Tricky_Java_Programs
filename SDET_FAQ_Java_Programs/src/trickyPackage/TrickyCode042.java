
/*
Q. What will happen if a final method is overriden in a selenium framework ?
 
   Answer :- Compile-time error (Remove 'final' modifier of 'ChildTestClass.setup')
   
   1. Base setup() is called
   2. Compile-time error
   3. Child setup() is called
   4. Runtime exception
*/

package trickyPackage;

public class TrickyCode042 {

}

class BaseTestClass extends TrickyCode042 {

	public final void setup() {
		System.out.println("This is BaseTestClass setup method");
	}

}

class ChildTestClass extends BaseTestClass {

//	public void setup() { //  Compile-time error (Remove 'final' modifier of 'ChildTestClass.setup')
//		System.out.println("This is ChildTestClass setup method");
//	}
}
