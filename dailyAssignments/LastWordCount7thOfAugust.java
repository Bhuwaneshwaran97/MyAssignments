package dailyAssignments;

public class LastWordCount7thOfAugust {

	public static void main(String[] args) {
		
		String text = "   fly me   to   the moon  ";
		String[] words = text.split("\\s+");
		String lastWord = words[words.length-1];
		int lastWordCount = lastWord.length();
		System.out.println(lastWordCount);
	}

}
