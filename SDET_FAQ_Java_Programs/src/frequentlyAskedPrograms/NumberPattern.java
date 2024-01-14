package frequentlyAskedPrograms;

public class NumberPattern {

	public static void main(String[] args) {

// 1st WAY		
		          		
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}		

///////////////////////////////////////////////////////
		
/* 2nd Way		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}		
*/		
	}

}
