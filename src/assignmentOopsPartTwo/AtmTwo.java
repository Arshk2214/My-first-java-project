package assignmentOopsPartTwo;

import java.util.Scanner;

public class AtmTwo extends BankOperationsTwo {

	public AtmTwo(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

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
		} else {
			System.out.println("Invalid credentials");
			return false;
		}

	}

}
