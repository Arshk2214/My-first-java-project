package WonderlandRidesOne;

import java.util.Scanner;

public class WonderlandRidesMain {

	public static void main(String[] args) {

		String choice;
		Scanner sc = new Scanner(System.in);
		System.out.println(" what do you want to ride today");
		choice = sc.nextLine();

		if (choice.equals("BR")) {
			BahemothRide br = new BahemothRide();
			br.rideRequirementsBahemothRide();

		} else if (choice.equals("LR")) {
			LeviathanRide lr = new LeviathanRide();
			lr.rideRequirementsLeviathanRide();

		} else if (choice.equals("YSR")) {
			YukonStrikerRide ysr = new YukonStrikerRide();
			ysr.rideRequirementsYukonStrikerRide();
		} else {
			System.out.println("wrong input");
		}
		sc.close();

	}

}
