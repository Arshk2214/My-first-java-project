package assignmentOne;

import java.util.Scanner;

public class LiscenseType {
	Scanner type = new Scanner(System.in);
	int age = 16; // value can vary to see different outcome

	void liscenseType() {
		if (age >= 16) {
			System.out.println("Have you cleared the test ?");
			boolean haveYouClearedTheTest = type.nextBoolean();
			if (haveYouClearedTheTest == true) {
				System.out.println(" Do you have G1  ?");
				boolean doYouHaveG1 = type.nextBoolean();
				if (doYouHaveG1 == true) {
					System.out.println("Do you have G2");
					boolean doYouHaveG2 = type.nextBoolean();
					if (doYouHaveG2 == true) {
						System.out.println("Congrats on passing G");
					} else {
						System.out.println("Congrats on passing G2");
					}
				} else {
					System.out.println("Congrats on G1");
				}
			} else {
				System.out.println("You must pass the test");
			}
		} else {
			System.out.println(" You must be 16 years old to conduct test");
		}

	}

}
