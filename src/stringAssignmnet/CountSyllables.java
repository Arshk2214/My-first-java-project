package stringAssignmnet;

public class CountSyllables {

	/*
	 * Create a function that counts the number of syllables a word has. Each
	 * syllable is separated with a dash Examples numberSyllables("buf-fet") ➞ 2
	 * numberSyllables("beau-ti-ful") ➞ 3 numberSyllables("mon-u-men-tal") ➞ 4
	 * numberSyllables("on-o-mat-o-poe-ia") ➞ 6
	 */

	public int numberSyllables(String word) {
		String[] syllables = word.split("-");
		int length = syllables.length;
		return length;

	}
}
