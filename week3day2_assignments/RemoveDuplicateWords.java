package week3day2_assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] empty = text.split(" ");
		Set<String> emptySet = new LinkedHashSet<String>();
		for (String words : empty) {
//			System.out.println(words);
			emptySet.add(words);
		}
		
		System.out.println(emptySet);
		String delimeter = " ";
		String unique = String.join(delimeter, emptySet);
		System.out.println(unique);
	
		
	}
	
}
