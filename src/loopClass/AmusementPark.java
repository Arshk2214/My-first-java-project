package loopClass;

import java.util.Scanner;

public class AmusementPark {

	int height;
	int numberOfPeople = 0;

	Scanner sc = new Scanner(System.in);

	void requirementsToRide() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(" Please enter your Height ");
			height = sc.nextInt();
			if (height > 90 && height < 200) {

				System.out.println("Enjoy your ride");
				numberOfPeople = numberOfPeople + 1;

				if (numberOfPeople == 10) {
					System.out.println(" Ride is full ");
					break;

				}

			} else {
				System.out.println(" Sorry you do not meet the requirements ");
			}

		}

	}
}
