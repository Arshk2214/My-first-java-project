package assignmentOopsPartTwo;

import java.util.Scanner;

public class AtmTwo extends BankOperationsTwo {

	public AtmTwo(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);
		// TODO Auto-generated constructor stub
	}

	double amount;
	Scanner sc = new Scanner(System.in);

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
	public boolean changePinPassword(String enteredPin) {

		if (isPinValid(enteredPin)) {
			System.out.println(" enter pin to change");
			String newPin = sc.next();
			if (newPin.equals(getPin()) || newPin.length() < 4) {
				System.out.println("New PIN cannot be the same as the old PIN and must have at least four digits.");
				return false;
			} else {
				setPin(newPin);
				System.out.println(" Pin changed sucessfully ");
				return true;
			}
		}
		return false;

	}

}
