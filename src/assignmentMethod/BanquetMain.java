package assignmentMethod;

import java.util.Scanner;

public class BanquetMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" How much is the banquet rent ? ");
		double bookingCost = sc.nextDouble();
		System.out.println("enter the food price");
		double food = sc.nextDouble();
		System.out.println(" enter the beverage cost");
		double beverageCost = sc.nextDouble();
		System.out.println(" Enter tip");
		double tip = sc.nextDouble();
		System.out.println(" how many people are there ?");
		int numberOfPeople = sc.nextInt();
		Banquet banquet = new Banquet(bookingCost, food, beverageCost, tip);
	       banquet.calculateTheTotalCost(numberOfPeople);
		
		sc.close();

	}
}
