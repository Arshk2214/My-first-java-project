package assignmentOopsPart1;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {
	Scanner sc = new Scanner(System.in);

	double amount;

	public void withdrawFunds() {

		System.out.println(" How much you would like to withdraw ?");
		amount = sc.nextDouble();
		if (johnAdams.getTotalFundsAvailable() >= amount && amount >= 0) {
			setBalance(johnAdams.getTotalFundsAvailable() - amount);
			System.out.println(" New Balance is :$" + getBalance());
		} else {
			System.out.println(" Invalid entry");
		}
	}

	public void depositFunds(double totalFundsAvailable) {

		System.out.println(" How much you would like to deposit ?");
		amount = sc.nextDouble();
		if (amount > 0) {
			setBalance(johnAdams.getTotalFundsAvailable() + amount);
			System.out.println(" Balnce :$" + getBalance());
		} else {
			System.out.println(" invalid entry ");
		}

	}
}
