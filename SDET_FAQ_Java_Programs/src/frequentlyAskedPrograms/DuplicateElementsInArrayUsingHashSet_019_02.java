package frequentlyAskedPrograms;

import java.util.HashSet;

public class DuplicateElementsInArrayUsingHashSet_019_02 {

	public static void main(String[] args) {

		String[] s = { "Java", "C", "C#", "Python", "Ruby", "C#", "HTML" };

		HashSet<String> langs = new HashSet<String>();
		
//		System.out.println(langs.add("Java")); // true
//		System.out.println(langs.add("Python")); // true
//		System.out.println(langs.add("Java")); // false

		boolean flag = false;

		for (String l : s) {
			if (langs.add(l) == false) {
				System.out.println("Found Duplicate Element: " + l);
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("Duplicate Element NOT Present");
		}

	}

}
