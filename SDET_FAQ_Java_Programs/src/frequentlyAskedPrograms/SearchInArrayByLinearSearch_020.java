package frequentlyAskedPrograms;

// Here Linear Search algorithm is shown to search element in array.

public class SearchInArrayByLinearSearch_020 {

	public static void main(String[] args) {
		
		int[] a = {10,20,40,50,30};
		
		int elementToSearch = 30;
		boolean flag = false;
		
		for(int i = 0; i<a.length; i++) {
			if(elementToSearch==a[i]) {
				System.out.println("Element found at: " + i);
				flag = true;
				break;				
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}

	}

}
