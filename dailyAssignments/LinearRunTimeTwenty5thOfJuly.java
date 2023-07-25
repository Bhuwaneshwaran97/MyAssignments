package dailyAssignments;

public class LinearRunTimeTwenty5thOfJuly {

	public static void main(String[] args) {
		
		int[] given_value = {2,2,1};
		int length = given_value.length;
		for (int i =1; i<length-1; i++){
			for (int j = i+1; j<length; j++) {
				if (given_value[i] != given_value[j]) {
					System.out.println("Unique value from the array is "+i);
				}
			}
		}

	}

}
