package week3day2_assignments;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String[] stringArray = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		int lengthOfstringArray = stringArray.length;
		Arrays.sort(stringArray);
		for (int i = lengthOfstringArray - 1; i >= 0; i--) {
			System.out.println(stringArray[i]+",");

		}
		

	}
}
