package assignmentOne;

public class LiscenseTypeUserInput {
	int age = 16;
	boolean doYouHaveG1 = true; // values can be changed to see different results
	boolean doYouHaveG2 = false;
	boolean haveYouPassedTheTest = true;

	void issueLicesnse() {
		if (haveYouPassedTheTest == true) {
			if (doYouHaveG1 == true && age >= 16) {
				if (doYouHaveG2 == true && age >= 16) {
					System.out.println("Congrats on G Liscense");

				} else {
					System.out.println("Congrats on G2");
				}

			} else {
				System.out.println("Congrats on G1");
			}
		} else {
			System.out.println("You must pass the test");
		}
	}
}
