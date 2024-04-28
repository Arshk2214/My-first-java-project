package stringAssignmnet;

public class CountSyllablesMain {

	public static void main(String[] args) {

		CountSyllables cs = new CountSyllables();
		System.out.println(" Number of Syllables in a word " + cs.numberSyllables("buf-fet"));
		System.out.println(" Number of Syllables in a word " + cs.numberSyllables("beau-ti-ful"));
		System.out.println(" Number of Syllables in a word " + cs.numberSyllables("mon-u-men-tal"));
		System.out.println(" Number of Syllables in a word " + cs.numberSyllables("on-o-mat-o-poe-ia"));

	}

}
