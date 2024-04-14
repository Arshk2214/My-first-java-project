package waterTank;

import java.util.Scanner;

public class WaterTank {

	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */
	int water;
	int waterInTank;

	Scanner sc = new Scanner(System.in);

	void fillWaterInWaterTank() {

		System.out.println(" How much water is already in the tank ? ");
		water = sc.nextInt();
		for (int i = 0; i < 101; i++) {
			if (water > 0 && water < 101) {
				waterInTank = water + i;
				if (waterInTank == 50) {
					System.out.println(" Watertank is half full");
				}

				if (waterInTank == 100) {

					System.out.println(" Please stop pouring .Tank is full");

				}
			} else {
				System.out.println(" Value can not be less than 0 and greater than 101.Please enter again.");
				water = sc.nextInt();

			}
		}

	}

}
