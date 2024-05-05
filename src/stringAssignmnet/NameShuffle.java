package stringAssignmnet;

public class NameShuffle {

	public String shuffleName(String name) {
		/*
		 * Create a method that accepts a string (of a person's first and last name) and
		 * returns a string with the first and last name swapped. Examples
		 * nameShuffle("Donald Trump") ➞ "Trump Donald" nameShuffle("Seymour Butts") ➞
		 * "Butts Seymour"
		 */

		String firstName = name.substring(0, name.indexOf(" "));
		String lastName = name.substring(name.indexOf(" "));
		String swapName = lastName + " " + firstName;
		return swapName;

	}

}
