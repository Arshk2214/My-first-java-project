package stringAssignmnet;

public class NameShuffle {

	public String shuffleName(String name) {

		String firstName = name.substring(0, name.indexOf(" "));
		String lastName = name.substring(name.indexOf(" "));
		String swapName = lastName + " " + firstName;
		return swapName;

	}

}
