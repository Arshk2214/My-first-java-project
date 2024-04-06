package assignmentOne;

import java.util.Scanner;

public class DiscoutCalculation {
	Scanner value = new Scanner(System.in);

	double originalPrice = 55.55;
	double discountedPrice;

	void CalculateDiscount() {
		System.out.println("Enter Promo Code");
		int promoCode = value.nextInt();

		discountedPrice = (originalPrice * (50 + promoCode)) / 100;

		if (promoCode == 5) {
			System.out.println("Discounted Price is : " + discountedPrice);

		}
		if (promoCode == 10) {
			System.out.println("Discounted Price is : " + discountedPrice);

		}
		if (promoCode == 20) {
			System.out.println("Discounted Price is : " + discountedPrice);

		}

	}

}
