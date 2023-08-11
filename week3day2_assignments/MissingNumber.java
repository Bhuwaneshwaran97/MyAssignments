package week3day2_assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,9,10,9,10,1,2,4};
		
		Set<Integer> duplicate = new LinkedHashSet<Integer>();
		
		for (int i =0; i<array.length;i++) {
			duplicate.add(array[i]);
		}
		
		System.out.println("Converted to set and removed duplicate : "+duplicate);
		
		Integer[] uniqueArray = duplicate.toArray(new Integer[duplicate.size()]);
		
		for (int i=0; i<uniqueArray.length;i++) {
			if (uniqueArray[i] != i+1) {
				System.out.println("The missing number is "+i);
			}
			i++;
		}
		
	}

}
