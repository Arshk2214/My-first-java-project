package stringAssignmnet;

public class PrefixSuffix {

	public boolean isPrefix(String word, String prefix) {
		if (word.startsWith(prefix)){
			return true;
		}

		return false;

	}

	public boolean isSuffix(String wordOne, String suffix) {
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

	public void displayResult1(String wordOne, String suffix) {
		if (isSuffix(wordOne, suffix)) {
			System.out.println(" word has sufix ");
		} else {
			System.out.println(" word does not have sufix");
		}
	}

}
