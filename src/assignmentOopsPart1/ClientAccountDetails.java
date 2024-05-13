package assignmentOopsPart1;

import java.util.Scanner;

public class ClientAccountDetails {
	Scanner sc = new Scanner(System.in);
	private String accountNumber;
	private String nameOfAccountHolder;
	private double totalFundsAvailable;
	private String pin;
	private String onlinePassword;

	public String getPin() {
		return pin;
	}

	public String getOnlinePassword() {
		return onlinePassword;
	}

	public ClientAccountDetails(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable,
			String pin, String onlinePassword) {
		super();
		this.accountNumber = accountNumber;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
		this.pin = pin;
		this.onlinePassword = onlinePassword;
	}

	public double getTotalFundsAvailable() {
		return totalFundsAvailable;
	}

	public void setTotalFundsAvailable(double totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setOnlinePassword(String onlinePassword) {
		this.onlinePassword = onlinePassword;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	public boolean isPinValid(String enteredPin) {

		if (getPin().equals(enteredPin)) {
			System.out.println(" You have logged in sucessfully ");
			return true;
		} else {
			for (int i = 0; i < 2; i++) {
				int maximumAttempts = 2;
				System.out.println(" Invalid pin.Please try again.Attepmts left :" + (maximumAttempts - i));

				String enterPin = sc.next();
				if (getPin().equals(enterPin)) {
					System.out.println(" You have logged in sucessfully ");
					return true;
				} else if (i == 1) {
					System.out.println("Account is locked");
				}
			}
			return false;
		}
	}

	public boolean isPasswordValid(String enteredPassword) {
		if (getOnlinePassword().equals(enteredPassword)) {
			System.out.println(" You have logged in sucessfully ");
			return true;
		}

		else {
			for (int i = 0; i < 2; i++) {
				int maximumAttempts = 2;
				System.out.println(" Invalid pin.Please try again.Attepmts left :" + (maximumAttempts - i));

				String enterPasswordOne = sc.next();
				if (enterPasswordOne.equals(getOnlinePassword())) {
					System.out.println(" You have logged in sucessfully ");
					return true;
				} else if (i == 1) {
					System.out.println("Account is locked");
				}

			}
		}
		return false;
	}
}
