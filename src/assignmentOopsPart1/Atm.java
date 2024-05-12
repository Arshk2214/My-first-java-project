package assignmentOopsPart1;

import java.util.Scanner;

public class Atm extends BankOperation {

	double amount;
	Scanner sc = new Scanner(System.in);

	public void withdrawFunds() {

		System.out.println(" How much you would like to withdraw ?");
		amount = sc.nextDouble();

		if (johnAdams.getTotalFundsAvailable() >= amount && amount % 10 == 0 && amount >= 0) {
			setBalance(johnAdams.getTotalFundsAvailable() - amount);
			System.out.println(" New Balance is :$" +getBalance());
		} else {
			System.out.println(" Invalid entry ");
		}

	}

	public void depositFunds() {

		System.out.println(" How much you would like to deposit ?");
		amount = sc.nextDouble();
		if (amount > 0) {
			setBalance(johnAdams.getTotalFundsAvailable() + amount);
			System.out.println(" New Balance is :$" + getBalance());
		} else {
			System.out.println(" amount needs to be greater than zero");
		}

	}

}
