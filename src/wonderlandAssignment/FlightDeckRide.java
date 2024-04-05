package wonderlandAssignment;

import java.util.Scanner; // Import the scanner class

public class FlightDeckRide {

	Scanner information = new Scanner(System.in); // Create a scanner object

	void isRiderEligible() {

		System.out.println("Do you have any heart condition or high blood pressure?");
		boolean questionone = information.nextBoolean();
		if (questionone == false) {
			System.out.println("Enter your Height and Weight ");
			double height = information.nextDouble(); // input value
			double weight = information.nextDouble();
			System.out.println("Height- " + height);
			System.out.println("Weight- " + weight);
			if (height > 52 && height < 78 && weight <= 100 && weight >= 40) {
				System.out.println("Enjoy your ride");

			} else {
				System.out.println("Sorry you do not meet the requirements");
			}

		} else {
			System.out.println("Sorry you are not allowed to ride");
		}

	}

}
