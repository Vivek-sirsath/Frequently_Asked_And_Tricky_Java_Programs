package frequentlyAskedPrograms;

public class DuplicateWordsInString_03 {

	public static void main(String[] args) {

		String str = "hi hello hi good morning hello";
        String word[] = str.split(" ");
        int count;

        for (int i = 0; i < word.length; i++) {
            // Skip if the count for this word has been printed already
            if (word[i] == null) {
                continue;
            }
            
            count = 1; // Initialize count for the current word

            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                    // Mark the duplicate word as processed
                    word[j] = null;
                }
            }

            if (count > 1) {
                System.out.println("The word " + word[i] + " occurred " + count + " times");
            }
        }
		
	}
}
