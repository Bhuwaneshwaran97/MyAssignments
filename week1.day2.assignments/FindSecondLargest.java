package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		int length = data.length;
		Arrays.sort(data);
		System.out.println("Sorted Array : "+Arrays.toString(data));
		System.out.println("Last Second largest number from sorted Array : "+data[length-2]);

	}

}
