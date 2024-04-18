package waterTank;

import java.util.Scanner;

public class WaterTank {

	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */

	String water;

	int waterOne;
	int total;
	int waterTwo;

	Scanner sc = new Scanner(System.in);

	void fillWaterInWaterTank() {
		System.out.println("How much water is already in tank ?");
		waterOne = sc.nextInt();
		if (waterOne >= 95) {
			System.out.println("Tank is already full.Adding more water can result in overflow.");
			waterOne = sc.nextInt();
		}

		for (int i = waterOne; i < 101; i += waterTwo) {

			System.out.println(" Do you want to add water ?");
			water = sc.next();
			if (water.equals("yes")) {
				System.out.println(" How much water you want to add ?");
				waterTwo = sc.nextInt();

				if (waterTwo > 10) {
					System.out.println(" bucket capacity is 10.Please enter again ");
					waterTwo = sc.nextInt();
				}
				total = i + waterTwo;
				if (total >= 95) {
					System.out.println(
							" Tank has reached to its full capacity .Adding more water can result into overfilling");
					break;

				}
				if (waterTwo >= 0 && waterTwo <= 10) {
					System.out.println("The water in tank is " + total);

				}

			}

		}

	}
}
