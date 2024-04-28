package stringAssignmnet;

public class CountSyllables {
	public int numberSyllables(String word) {
		String[] syllables = word.split("-");
		int length = syllables.length;
		return length;

	}
}
