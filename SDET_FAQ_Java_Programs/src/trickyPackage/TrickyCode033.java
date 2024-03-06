
/*
Q. What will be the output of the following program ?
 
   Answer :- 8 times  *** and 7 times +++++
   
   1. 15 times ***
   2. 15 times +++++
   3. 8 times  *** and 7 times +++++
   4. Both will print only once
*/


package trickyPackage;

public class TrickyCode033 {

	public static void main(String[] args) {
		
		int count = 1;
		
		while(count <= 15) {
			System.out.println(count%2==1 ? "***" : "+++++");
			
		    ++count;
		}

	}

}
