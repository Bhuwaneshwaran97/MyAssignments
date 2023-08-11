package week3day2_assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> emptySet = new TreeSet<Integer>();
		
		for (int i = 0; i<data.length;i++) {
			emptySet.add(data[i]);
		}
		
		List<Integer> setToList = new ArrayList<Integer>();
		System.out.println("From set to list converted is "+emptySet);
//		List<Integer> subList = emptyList.subList(4, 5);
		
//		System.out.println("The second largest value is "+subList);
		for (int i =0; i<emptySet.size();i++) {
			setToList.add(i);
		}
		
		System.out.println(setToList);
	}

}
