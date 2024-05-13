package assignmentOopsPartTwo;

import java.util.Scanner;

public class OnlineBankingTwo extends BankOperationsTwo {
	Scanner sc = new Scanner(System.in);
	double amount;

	public OnlineBankingTwo(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);
		// TODO Auto-generated constructor stub
	}

	public void withdrawFunds() {

		System.out.println(" How much you would like to withdraw ?");
		amount = sc.nextDouble();

		if (getTotalFundsAvailable() >= amount && amount % 10 == 0 && amount >= 0) {
			setTotalFundsAvailable(getTotalFundsAvailable() - amount);
			System.out.println(" New Balance is :$" + getTotalFundsAvailable());
		} else {
			System.out.println(" Invalid entry ");
		}

	}

	public void depositFunds() {

		System.out.println(" How much you would like to deposit ?");
		amount = sc.nextDouble();
		if (amount > 0) {
			setTotalFundsAvailable(getTotalFundsAvailable() + amount);
			System.out.println(" New Balance is :$" + getTotalFundsAvailable());
		} else {
			System.out.println(" amount needs to be greater than zero");
		}

	}

	@Override
	public boolean changePinPassword(String enteredPassword) {
		if (isPasswordValid(enteredPassword)) {
			System.out.println(" Enter new password");
			String newPassword = sc.next();
			if (newPassword.equals(getOnlinePassword()) || newPassword.length() > 8
					|| newPassword.matches(".*[&@$].*")) {
				System.out.println(
						"Password cannot be the same as the old password, must have at least 8 characters, and cannot contain these special characters (&, $, @).");
				return false;
			} else {
				setOnlinePassword(newPassword);
				System.out.println(" Password changed ");
				return true;
			}
		}
		return false;

	}

}
