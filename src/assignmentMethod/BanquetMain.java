package assignmentMethod;

import java.util.Scanner;

public class BanquetMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfPeople;
		Banquet pricesForFortyGuests = new Banquet(2000, 2000, 600, 1000);
		Banquet pricesForFortyToEightyGuests = new Banquet(2000, 3000, 700, 2000);
		Banquet pricesForEightyToOneHundreFiftyGuestsGuests = new Banquet(2000, 4000, 900, 3000);
		Banquet pricesForMoreThanOneHundredAdFiftyGuests = new Banquet(2000, 5000, 1100, 4000);

		System.out.println("How many guests are there ? ");
		numberOfPeople = sc.nextInt();
		Banquet[] prices = { pricesForFortyGuests, pricesForFortyToEightyGuests,
				pricesForEightyToOneHundreFiftyGuestsGuests, pricesForMoreThanOneHundredAdFiftyGuests };
		Banquet choice = new Banquet();
		choice = choice.numberOfGuests(prices, numberOfPeople);
		System.out.println("The total cost before taxes: $" + choice.calculateBaseCost());
		System.out.println("The total after taxes:$" + choice.calculateTax());
		System.out.println("Services cess as per total number of guests:$" + choice.calculateCess(numberOfPeople));
		System.out.println("The total amount is $:" + choice.calculateTheTotalCost());
		sc.close();
	}
}
