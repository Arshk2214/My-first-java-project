package loopClass;

import java.util.Scanner;

public class AmusementPark {

	int height;
	int numberOfPeople;

	Scanner sc = new Scanner(System.in);

	void requirementsToRide() {
		System.out.println(" How many people are already in the ride ?");
		numberOfPeople = sc.nextInt();
		if (numberOfPeople==10) {
			System.out.println(" Ride is full ");
			

		}

		for (int i = numberOfPeople+1; i <=10; i++) {
			System.out.println(" Please enter your Height ");
			height = sc.nextInt();
			if (height > 90 && height < 200) {

				System.out.println("Enjoy your ride");

				if (i == 10) {
					System.out.println(" Ride is full ");
					break;

				}

			} else {
				System.out.println(" Sorry you do not meet the requirements ");
				--i;
			}

		}

	}
}
