package dailyAssignments;

public class ArrayMajorityTwenty7thOfJuly {

	public static void main(String[] args) {

		int count = 0;
		int[] arrayNumber = {2, 2, 1, 1, 1, 2, 2};
		int length = arrayNumber.length;
		int majorityElement = 0;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arrayNumber[i] == arrayNumber[j]) {
					count++;

				}
			}
			if (count >= length / 2) {
				majorityElement = arrayNumber[i];
				break;

			}
			count = 0;
		}
		System.out.println("The majority element is: " + majorityElement);
	}

}
