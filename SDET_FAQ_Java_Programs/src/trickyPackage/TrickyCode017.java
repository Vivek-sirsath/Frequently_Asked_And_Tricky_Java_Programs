package trickyPackage;

//Q. What is the output of the following code? true or false
//Answer: Output is false

public class TrickyCode017 {

	public static void main(String[] args) {
		
		String c = "Hello i love java";
		boolean var;
		
		var = c.startsWith("hello"); // If "Hello", then returns true
		System.out.println(var);

	}

}
