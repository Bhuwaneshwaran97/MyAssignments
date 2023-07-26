package dailyAssignments;

public class IsHappyTwenty26thOfJuly {
	
	public static int isHappy(int num) {
		int happy =0, sum =0;
		
		while(num>0) {
			happy = num%10;
			sum = sum + (happy*happy);
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num = 19;
		int result = num;
		
		while (result !=1 && result !=4) {
			result = isHappy(result);
		}
		
		if (result ==1 )
			System.out.println(num+" is a happy number");
		else if(result ==4) {
			System.out.println(num+" is not a happy number");
		}
	}
}