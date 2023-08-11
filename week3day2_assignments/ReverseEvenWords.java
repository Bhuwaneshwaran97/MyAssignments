package week3day2_assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] testSplit = test.split(" ");
		
		for (int i = 0; i < testSplit.length; i++) {
           
            if (i % 2 != 0) {
                
                char[] characters = testSplit[i].toCharArray();
            
                for (int j = characters.length - 1; j >= 0; j--) {
                    System.out.print(characters[j]);
                }
                System.out.print(" ");
            } else {
                System.out.print(testSplit[i] + " ");
            }
        }
    }
}






