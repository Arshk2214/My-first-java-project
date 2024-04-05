package operatorsJava;

public class DonateBlood {

	int age = 25;
	double weight = 49;

	void checkWeightAndAge() {

		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("You can donate blood");

			} else {
				System.out.println("you must weigh equal to or more than 50 kg to donate blood");
			}
		} else {
			System.out.println("You must be 18 years old to donate blood");
		}

	}
}
