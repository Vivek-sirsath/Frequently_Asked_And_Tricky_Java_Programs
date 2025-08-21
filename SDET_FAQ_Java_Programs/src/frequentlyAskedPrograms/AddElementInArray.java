package frequentlyAskedPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class AddElementInArray {

	public static void main(String[] args) {
		
		String cars[] = {"Volvo", "BMW", "Audi"};

		// If we don't pass the array reference variable 'cars'
		// ArrayList al = new ArrayList(Arrays.asList());
		
		// Printing without passing array reference variable, the output will be: : []		
		// System.out.println("Without passing array reference variable : " + al);
		
		ArrayList al = new ArrayList(Arrays.asList(cars));
		
		System.out.println("Before adding : " + al); // [Volvo, BMW, Audi]
		
		// Add an element into array
		al.add("Jaguar");
		System.out.println("After adding : " + al); // [Volvo, BMW, Audi, Jaguar]
		
		// Remove element from Array
		al.remove(1);
		System.out.println("After removing index-1 element : " + al); // [Volvo, Audi, Jaguar]
		
	}

}
