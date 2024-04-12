package WonderlandRidesOne;

public class YukonStrikerRide {
	double height = 50;
	double weight = 31;
	int age = 10;
	Boolean doYouHaveanyHeartCondition = true;

	void rideRequirementsYukonStrikerRide() {

		if (doYouHaveanyHeartCondition) {
			if (age >= 15) {
				if (weight >= 40) {

					if (height >= 50) {

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
		} else {
			System.out.println(" Sorry you are not allowed to ride");
		}

	}
}
