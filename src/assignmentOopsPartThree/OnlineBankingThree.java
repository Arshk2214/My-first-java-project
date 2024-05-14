package assignmentOopsPartThree;

import java.util.Scanner;

public class OnlineBankingThree extends BankingRules implements BankOperations {
	Scanner sc = new Scanner(System.in);
	int enteredAmount;
	double totalWithdrawal;

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
			} else if (totalWithdrawal + enteredAmount > dailyWithdrawalLimit()) {

				System.out.println(" Withdraw limit for a day is $1000 . ");

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
			System.out.println(" New balance" + johnAdams.getTotalFundsAvailable());
		}

	}

	@Override
	public void numberOfTransactionsLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean changePinPassword(String enteredPassword) {

		System.out.println(" Enter new password");
		String newPassword = sc.next();
		if (newPassword.equals(johnAdams.getOnlinePassword()) || newPassword.length() > 8
				|| newPassword.matches(".*[&@$].*")) {
			System.out.println(
					"Password cannot be the same as the old password, must have at least 8 characters, and cannot contain these special characters (&, $, @).");
			System.out.println("Select option 3 again to change password");
			return false;
		} else {
			johnAdams.setOnlinePassword(newPassword);
			System.out.println(" Password changed ");
			return true;
		}

	}

}
