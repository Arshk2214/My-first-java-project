package stringAssignmnet;

public class PrefixSuffix {
	/*
	 * Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
	 * isPrefix should return true if it begins with the prefix argument.
	 * isSuffix should return true if it ends with the suffix argument. Otherwise
	 * return false.
	 * 
	 * Examples : isPrefix("automation", "auto-") ➞ true isSuffix("arachnophobia",
	 * "-phobia") ➞ true isPrefix("retrospect", "sub-") ➞ false isSuffix("vocation",
	 * "-logy") ➞ false
	 */

	public boolean isPrefix(String word, String prefix) {
		prefix = prefix.substring(0, prefix.length() - 1);
		if (word.startsWith(prefix)) {
			return true;
		}

		return false;

	}

	public boolean isSuffix(String wordOne, String suffix) {
		suffix = suffix.substring(1);
		if (wordOne.endsWith(suffix)) {
			return true;
		}
		return false;

	}

	public void displayResult(String word, String prefix) {
		if (isPrefix(word, prefix)) {
			System.out.println(" word has prefix ");
		} else {
			System.out.println(" word does not have prefix");
		}
	}

	public void displayResultOne(String wordOne, String suffix) {
		if (isSuffix(wordOne, suffix)) {
			System.out.println(" word has sufix ");
		} else {
			System.out.println(" word does not have sufix");
		}
	}

}
