/*Java Challenge (1/20)

Given a non-negative integer x, compute and return the square root of x.
E
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.*/

package dailyAssignments.twenty4thOfJuly;

public class Challenge1SquareRoot {

	public static void main(String[] args) {
		
		int square_input = 15;
		double temp;
		double sr = square_input/2;
		
		do {
			temp =sr;
			sr = (temp+(square_input/temp))/2;
		
		} while ((temp - sr) !=0);
		int sqr_output = (int)sr;
		System.out.println("Square root of " +square_input + " is "+sqr_output);
	

	}

}
