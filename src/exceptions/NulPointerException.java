package exceptions;

import java.io.IOException;

public class NulPointerException {

	String name = null;

	public void changeName() {

		try {
			name.charAt(1); // Exception will occur as name is null

		} catch (NullPointerException e) {
			System.out.println(" Null point Exception " + e.getMessage());

		} finally {
			System.out.println(" final block"); // this will print even if there is exception
		}

	}

	public void name(String nameOne) throws IOException { // throws keyword let others know this
		// method has exception ,caller can catch exception
		if (nameOne.length() < 2) {

			throw new IllegalArgumentException("Name needs to have more than two alphabets.");
		}
	}

}
