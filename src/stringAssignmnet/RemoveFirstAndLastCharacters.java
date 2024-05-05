package stringAssignmnet;

public class RemoveFirstAndLastCharacters {

	public void removeFirstAndLastChar(String word) {
		/*
		 * Create a function that removes the first and last characters from a string.
		 * Example : removeFirstLast("hello") ➞ "ell" removeFirstLast("a") ➞ "a"
		 */

		if (word != null && word.length() > 2) {
			System.out.println("word after changes :" + word.substring(1, word.length() - 1));
		} else {
			System.out.println(word);
		}

	}
}