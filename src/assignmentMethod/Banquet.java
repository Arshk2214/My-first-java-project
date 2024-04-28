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

	public Banquet(double bookingCost, double food, double tip, double beverageCost) {
		super();
		this.bookingCost = bookingCost;
		this.food = food;
		this.tip = tip;
		this.beverageCost = beverageCost;

	}

	public double checkValidInput(int numberOfPeople) {
		if (bookingCost >= 0 && food >= 0 && tip >= 0 && beverageCost >= 0) {
			System.out.println(" THe total cost is " + calculateTheTotalCost(numberOfPeople));

		} else {
			System.out.println("Please enter valid amount");
		}
		return numberOfPeople;
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

	public double calculateTheTotalCost(int numberOfPeople) {
		totalAmount = calculateBaseCost() + calculateTax() + calculateCess(numberOfPeople);
		return totalAmount;
	}

}
