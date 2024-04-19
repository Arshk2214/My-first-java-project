package assignmentMethod;

public class Banquet {
	double bookingCost;
	double food;
	double tip;
	double beverageCost;
	double totalOfBaseCost;
	double tax;
	double cessTotal;
	double totalAmount;
	double priceAsPerGuest;

	public Banquet(double bookingCost, double food, double tip, double beverageCost) {
		super();
		this.bookingCost = bookingCost;
		this.food = food;
		this.tip = tip;
		this.beverageCost = beverageCost;

	}

	public Banquet() {
	}

	public Banquet numberOfGuests(Banquet[] prices, int numberOfPeople) {
		for (int i = 0; i < prices.length; i++) {
			if (numberOfPeople <= 40) {
				return prices[0];
			}
			if (numberOfPeople > 40 && numberOfPeople <= 80) {
				return prices[1];
			}
			if (numberOfPeople > 80 && numberOfPeople <= 150) {
				return prices[2];
			}
			if (numberOfPeople > 150) {
				return prices[3];
			}

		}
		return null;
	}

	public double calculateBaseCost() {
		totalOfBaseCost = bookingCost + food + beverageCost + tip;
		return totalOfBaseCost;

	}

	public double calculateTax() {

		tax = (0.13 * totalOfBaseCost);
		return tax;
	}

	public double calculateCess(int numberOfPeople) {
		if (numberOfPeople <= 40) {
			cessTotal = (0.04 * totalOfBaseCost);
		}
		if (numberOfPeople > 40 && numberOfPeople <= 80) {
			cessTotal = (0.08 * totalOfBaseCost);
		}
		if (numberOfPeople > 80 && numberOfPeople <= 150) {
			cessTotal = (0.1 * totalOfBaseCost);
		}
		if (numberOfPeople > 150) {
			cessTotal = (0.125 * totalOfBaseCost);
		}
		return cessTotal;

	}

	public double calculateTheTotalCost() {
		totalAmount = totalOfBaseCost + tax + cessTotal;
		return totalAmount;
	}

}
