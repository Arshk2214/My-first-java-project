package assignmentOopsPartTwo;

import java.util.Scanner;

public class OnlineBankingTwo extends BankOperationsTwo {
	Scanner sc = new Scanner(System.in);

	public OnlineBankingTwo(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);
		// TODO Auto-generated constructor stub
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
		} else {
			System.out.println("Invalid credentials");
			return false;
		}

	}

}
