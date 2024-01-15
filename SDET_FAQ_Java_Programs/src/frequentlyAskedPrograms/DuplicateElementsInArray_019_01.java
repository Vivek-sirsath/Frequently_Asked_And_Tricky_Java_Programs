package frequentlyAskedPrograms;

public class DuplicateElementsInArray_019_01 {

	public static void main(String[] args) {

		String[] s = { "Java", "C", "C#", "Python", "Ruby", "C#", "HTML" };

//		Approach_01: Using nested for loop
//		Outer for loop to iterate the each element in array and will compare that element with rest of elements
//		Inner for loop to compare and iterate rest of the element with the stored outer for-loop element
		
		boolean flag = false;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					System.out.println("Found Duplicate Element: " + s[i]);
					flag = true;
				}
			}
		}
		if(flag==false) { // If use '=' instead '==' : NO OUTPUT in Console
			System.out.println("Duplicate Element NOT Present");
		}
	}
}
