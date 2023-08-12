package week3day2_assignments;

import java.util.ArrayList;
import java.util.Collections;
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
		
		List<Integer> setToList = new ArrayList<Integer>(emptySet);
		Collections.sort(setToList);
		int size = setToList.size();
		System.out.println(size-2);
	}

}
