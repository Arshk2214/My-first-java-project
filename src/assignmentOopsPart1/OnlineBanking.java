package assignmentOopsPart1;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {
	Scanner sc = new Scanner(System.in);

	double amount;

	public void withdrawFunds(double totalFundsAvailable) {

		System.out.println(" How much you would like to withdraw ?");
		amount = sc.nextDouble();
		if (totalFundsAvailable >= amount && amount >= 0) {
			balance = totalFundsAvailable - amount;
			System.out.println(" New Balance is :$" + balance);
		} else {
			System.out.println(" Invalid entry");
		}
	}

	public void depositFunds(double totalFundsAvailable) {

		System.out.println(" How much you would like to deposit ?");
		amount = sc.nextDouble();
		if (amount > 0) {
			balance = totalFundsAvailable + amount;
			System.out.println(" Balnce :$" + balance);
		} else {
			System.out.println(" invalid entry ");
		}

	}
}
