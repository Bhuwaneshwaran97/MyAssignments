package week3day2_assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String myname = "Bhuwaneshwaran";
		char[] charArray = myname.toCharArray();
		Set<Character> duplicate = new LinkedHashSet<Character>();
		
		for (Character charcterC: charArray) {
			duplicate.add(charcterC);
		}
		
		System.out.println(duplicate);
	}

}
