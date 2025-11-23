/* Ternary Operator :

  SYNTAX :
  ------
           result = (condition) ? value_if_true : value_if_false;

*/

package frequentlyAskedPrograms;

public class FindLargestOf2NumbersUsingTernaryOperator {

	public static void main(String[] args) {

		int a = 20, b = 30;

		String result = (a > b) ? "a is largest number" : "b is largest number";
		System.out.println(result);

	}

}
