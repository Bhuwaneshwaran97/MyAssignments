package dailyAssignments;

public class ArrayTwice28thOfJuly {
	
	public static boolean isHappy() {
		
		int[] num = {1,2,1,1};
		int count = 0;
		int length = num.length;
		
		for (int i =0; i<length; i++) {
			for (int j = i+1; j<length; j++) {
				if(num[i] == num[j]) {
					count++;
				}
			}
	
		}
		
		return count>0;
		
		
	}

	public static void main(String[] args) {
		boolean result = isHappy();
		System.out.println("Result: "+result);
			
		}

	}

