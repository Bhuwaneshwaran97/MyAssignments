package week3day2_assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		String input = "madam";
		String replaceAll = input.toLowerCase().replaceAll("[^a-zA-Z0-9:]", "");
		String replaceAll2 = replaceAll.replaceAll(":", "");
		char[] charArray = replaceAll2.toCharArray();
		System.out.println(replaceAll2);
		String rev = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
			if (replaceAll2.equals(rev)) {
				System.out.println("It's a Palindrome");

			} else {
				System.out.println("It's not a Palindrome");
			}

		}

	}

}
