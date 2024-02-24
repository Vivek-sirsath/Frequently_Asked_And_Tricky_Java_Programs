
/*
   Q. What will happen when you compile and run the following code?
   Answer: Blank Output
   
   1: 0
   2: Blank output
   3: ArrayIndexOutOfBoundsException
   4: Compilation error
   
   > In Java, when you create an array of a primitive type (such as char),
     the elements of the array are initialized with default values. For char, 
     the default value is the null character, represented by \u0000.
   > In the program, charArray is an array of char with a size of 2. However,
     since no values are assigned to the array elements explicitly, 
     they are initialized with the default value, which is \u0000.
   > When you print charArray[1], it accesses the second element of the array, 
     which is \u0000, representing the null character.
*/

package trickyPackage;

public class TrickyCode029 {

	public static void main(String[] args) {
		
		char charArray[] = new char[2];
		System.out.println(charArray[1]);
		
	}
	
}
