package week3day2_assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String input = "changeme";
		char[] charArray = input.toCharArray();
		for (int i =0; i<charArray.length;i++) {
			if (i%2 !=0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		String modifiedString = new String(charArray);
		System.out.println(modifiedString);
	}

}
