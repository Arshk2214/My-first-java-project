package assignmentOopsPartThree;

import java.util.Scanner;

public class AtmThree extends BankingRules implements BankOperations {
	Scanner sc = new Scanner(System.in);
	int totalWithdrawal;
	int enteredAmount;

	

	@Override
	public void numberOfTransactionsLimit() {

	}

	@Override
	public void withdrawFunds() {

		if (totalWithdrawal >= dailyWithdrawalLimit()) {
			System.out.println("You have reached your daily withdrawal limit.");
		} else {
			System.out.println("Please enter amount that you would like to withdraw");
			enteredAmount = sc.nextInt();

			if (enteredAmount > johnAdams.getTotalFundsAvailable()) {
				System.out.println(" Insufficent Funds..Please add sufficent funds to withdraw ");
			} else if (enteredAmount == 0) {
				System.out.println(" Amount must not be zero");
			}

			else if (totalWithdrawal + enteredAmount > dailyWithdrawalLimit()) {

				System.out.println(" Withdraw limit for a day is $1000 .");

			}

			else {
				if (enteredAmount % 10 != 0) {
					System.out.println(" Amount needs to be multiple of 10");
				} else {
					johnAdams.setTotalFundsAvailable(johnAdams.getTotalFundsAvailable() - enteredAmount);
					totalWithdrawal += enteredAmount;
					System.out.println(" New Balance :$ " + johnAdams.getTotalFundsAvailable());
				}
			}

		}

	}

	@Override
	public void depositFunds() {
		System.out.println(" Please add amount that you would like to deposit");
		enteredAmount = sc.nextInt();
		johnAdams.setTotalFundsAvailable(johnAdams.getTotalFundsAvailable() + enteredAmount);
		if (enteredAmount == 0) {
			System.out.println(" Amount needs to be greater than zero");
		} else {
			System.out.println(" New balance :$ " + johnAdams.getTotalFundsAvailable());
		}
	}

	@Override

	public boolean changePinPassword(String enteredPin) {

		System.out.println(" enter pin to change");
		String newPin = sc.next();
		if (newPin.equals(johnAdams.getPin()) || newPin.length() < 4) {
			System.out.println("New PIN cannot be the same as the old PIN and must have at least four digits.");
			System.out.println("Select option 3 again to change pin");
			return false;
		} else {
			johnAdams.setPin(newPin);
			System.out.println(" Pin changed sucessfully ");
			return true;
		}

	}

}
