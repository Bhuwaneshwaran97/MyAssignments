/*Here is the input
int[] arr = {1,2,3,4,7,6,8};
Sort the array	
loop through the array (start i from arr[0] till the length of the array)
check if the iterator variable is not equal to the array values respectively
print the number
once printed break the iteration*/

package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = arr[0]; i<arr.length;i++)
			if (i != arr[i]) {
				System.out.println(arr[i]);
				break;
			}

	}

}
