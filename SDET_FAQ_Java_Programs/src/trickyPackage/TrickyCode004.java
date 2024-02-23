package trickyPackage;

/* Q. What will happen when we compile and run the following code?
   Answer - false
  
  Truth Tables:
  ============
  Logical AND ('&&') operator:
  ===========================
  This operator returns true only if both operands are true, otherwise it returns false.
  
  true	&& true	- true
  true	&& false - false
  false	&& true - false
  false	&& false - false
  
  ======================================================================================
  
  Logical OR ('||') operator:
  ===========================
  This operator returns true if at least one of the operands is true, otherwise it returns false.
  
  true  || true - true
  true  || false - true
  false	|| true	- true
  false || false - false

   So, 'true && false && !true' simplifies to 'true && false && false', which ultimately evaluates to false.
   
 */

public class TrickyCode004 {

	public static void main(String[] args) {

		boolean b1 = true, b2 = false, b3 = true;

		System.out.println(b1 && b2 && !b3); // (true && false && false) = false

	}

}
