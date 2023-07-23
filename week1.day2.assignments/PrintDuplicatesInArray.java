package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int length = arr.length;
		// declare an int variable named count
		int count;
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i<length-1; i++) {
			
		
			// assign 0 to count
			count = 0;
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int j = i+1; j<length; j++) {
				
				// compare both the loop variables & check they're equal
				if (arr[i] == arr[j]) {
					// print the matching value
					System.out.println("Duplicate value are "+arr[i] + " and count is "+count);
				}
			}			
		
	}

}
}