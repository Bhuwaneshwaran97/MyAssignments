package week3day2_assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPayPal {

	public static void main(String[] args) {
		
		String text = "PayPal India";
		char[] textArray = text.toCharArray();
		Set<Character> charText = new LinkedHashSet<Character>();
		Set<Character> dupcharText = new LinkedHashSet<Character>();
		
		for (Character i: textArray) {
			if (!charText.add(i)) {
				dupcharText.add(i);
			}
		}
		
		System.out.println("The unique chracters are: " +charText);
		System.out.println("The duplicate chracters are: "+dupcharText);
	}

}


