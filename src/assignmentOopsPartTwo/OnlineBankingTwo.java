package assignmentOopsPartTwo;

import java.util.Scanner;

public class OnlineBankingTwo extends BankOperationsTwo {
	Scanner sc = new Scanner(System.in);

	public OnlineBankingTwo(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);
		// TODO Auto-generated constructor stub
	}

	public boolean isPasswordValid(String enteredPassword) {
		if (onlinePassword.equals(enteredPassword)) {
			return true;
		}
		return false;
	}

	@Override
	public void changePinPassword(String enteredPassword) {
		if (isPasswordValid(enteredPassword)) {
			System.out.println(" Enter new password");
			String newPassword = sc.next();
			if (newPassword.equals(onlinePassword) || newPassword.length() > 8 || newPassword.contains("&")
					|| newPassword.contains("$") || newPassword.contains("@")) {
				System.out.println(
						" Password can not be same as old password and password can't have less than 8 characters and  these special characters (&,$, @)");
			} else {
				onlinePassword = newPassword;
				System.out.println(" Password changed ");
			}
		} else {
			System.out.println("Invalid credentials");
		}

	}

}
