package assignmentOopsPart1;

import java.util.Scanner;

public class Atm extends BankOperation {

	double amount;
	Scanner sc = new Scanner(System.in);

	// method overloading
	public void withdrawFunds(double totalFundsAvailable) {

		System.out.println(" How much you would like to withdraw ?");
		amount = sc.nextDouble();

		if (totalFundsAvailable >= amount && amount % 10 == 0 && amount >= 0) {
			balance = totalFundsAvailable - amount;
			System.out.println(" New Balance is :$" + balance);
		} else {
			System.out.println(" Invalid entry ");
		}

	}

	public void depositFunds(double totalFundsAvailable) {

		System.out.println(" How much you would like to deposit ?");
		amount = sc.nextDouble();
		if (amount > 0) {
			balance = totalFundsAvailable + amount;
			System.out.println(" New Balance is :$" + balance);
		} else {
			System.out.println(" amount needs to be greater than zero");
		}

	}

}
