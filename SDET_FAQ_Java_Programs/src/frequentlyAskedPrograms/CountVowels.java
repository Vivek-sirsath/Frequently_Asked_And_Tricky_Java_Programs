package frequentlyAskedPrograms;

// 1) By Iterative Method

public class CountVowels {

	public static void main(String[] args) {

		String str = "GeeksForGeeks";
		str = str.toLowerCase();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			// Check if char[i] is vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				// count increments if there is vowel in char[i]
				count++;
			}
		}

		System.out.println("Total no of vowels in string are: " + count);
	}

}
