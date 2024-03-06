package trickyPackage;

/*  Q. What is the output of the following code
    Answer: Output is 1
    
    Recursion is a programming technique where a function calls itself, 
    either directly or indirectly, to solve a problem.
    Here, recursion occurs within the func() method.
*/

// Instead of TrickyCode018 class name should be Recursion
class TrickyCode018 {

	int func(int n) {

		int result;
		if (n == 1)
			return 1;
		result = func(n - 1);
		return result;
	}

	public static void main(String[] args) {

		TrickyCode018 obj = new TrickyCode018();
		System.out.println(obj.func(5));
	}
}

class Output {

	/*
	 * main method should be here according to Original question 
	 * Insted of, TrickyCode018 obj = new TrickyCode018();
	 * Recursion obj = new Recursion(); 
	 * System.out.println(obj.func(5));
	 */
}
