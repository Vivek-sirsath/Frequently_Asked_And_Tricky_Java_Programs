/* Ternary Operator :

  SYNTAX :
  ------
           result = (condition) ? value_if_true : value_if_false;
           
           i.e. 
           
           result = (condition) ? If_True Code_1 execute : If_False Code_2 execute

*/

package frequentlyAskedPrograms;

public class FindLargestOf2NumbersUsingTernaryOperator {

	public static void main(String[] args) {

		int a = 50, b = 30;
		
		// 1st way
		String result = (a > b) ? "a is largest number" : "b is largest number";
		System.out.println(result);
		
		
		// 2nd way
		String res = (a < b) ? "b is largest number" : "a is largest number";
		System.out.println(res);

	}

}
