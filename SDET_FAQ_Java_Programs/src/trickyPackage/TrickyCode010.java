package trickyPackage;

/*  Q. What will happen when you compile and run the following code
    Answer: The variable 'var1' is set to elements[0]
    
       The ternary operator '(condition) ? :' is utilized here.
       
    1. The condition inside the parentheses is elements.length > 0. 
       This checks if the length of the array elements is greater than 0.
       If it is true, it means that the array contains at least one element.
       
    2. If the condition is true (i.e., elements.length > 0 evaluates to true), 
       then the expression immediately following the question mark ? is executed. 
       In this case, it's elements[0], which retrieves the first element from the elements array. 
       
    3. If the condition is false (i.e., elements.length > 0 evaluates to false), 
       then the expression immediately following the colon : is executed. In this case, it's null, 
        which means that there are no elements in the elements array, so var1 is assigned the value null.
*/  

public class TrickyCode010 {

	public static void main(String[] args) {

		String[] elements = { "for", "tea", "too" }; // If Array is empty, return null as output

		String var1 = (elements.length > 0) ? elements[0] : null; // try [1],[2]

		// If we print variable 'var1'
		System.out.println(var1); // for
	}

}
