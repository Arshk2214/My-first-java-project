package WonderlandRidesOne;

public class LeviathanRide {
	double height = 48;
	double weight = 31;
	int age = 10;

	void rideRequirementsLeviathanRide() {
		if (age >= 10) {
			if (weight >= 30) {

				if (height >= 48) {

					System.out.println("Congrats you meet the requirements. Enjoy your ride");
				} else {
					System.out.println(" Height must be over 48 inches or 4 foot");

				}
			} else {
				System.out.println("Sorry weight must be over 30 kgs .");
			}
		} else {
			System.out.println("Sorry rider must be 10 years old or above to ride");
		}
	}
}
