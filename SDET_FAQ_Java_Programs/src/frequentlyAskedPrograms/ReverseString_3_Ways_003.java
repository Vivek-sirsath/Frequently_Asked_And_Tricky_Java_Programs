package frequentlyAskedPrograms;

public class ReverseString_3_Ways_003 {

	public static void main(String[] args) {
		
		String str = "ABCD";
		String rev = "";  // If rev="null" --> nullDCBA
		
		// 1). Using + (String Concatenation) Operator
		
/*		int len = str.length();      // 4 
		
		for(int i=len-1; i>=0; i--) {
		
			rev= rev+str.charAt(i);	
		}
		System.out.println("Reverse String using concatenation operator is: " + rev);
*/
		
		// 2). Using character array
/*		
		char a[] = str.toCharArray();
		
		int len = a.length;      // 4
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse String using character array is: " + rev);
*/
		
		// 3). Using StringBuffer Class
		StringBuffer sb = new StringBuffer(str.toString());  
		// We can directly pass the string also i.e. "Apple" >> elppA
		System.out.println("Reverse String using StringBuffer is: " + sb.reverse());
	}

}
