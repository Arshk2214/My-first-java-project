package assignmentOopsPartTwo;
import java.util.Scanner;
public class AtmTwo extends BankOperationsTwo {
	Scanner sc = new Scanner(System.in);
	public AtmTwo(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);

	}

	public boolean isPinValid(String enteredPin) {
		if (pin.equals(enteredPin)) {
			return true;
		}

		return false;
	}

	@Override
	public void changePinPassword(String enteredPin) {

		if (isPinValid(enteredPin)) {
			System.out.println(" enter pin to change");
			String newPin = sc.next();
			if (newPin.equals(pin) || newPin.length() < 4) {
				System.out.println(" Pin can not be same as old pin and pin digits need to be atleast four");
			} else {
				pin = newPin;
				System.out.println(" Pin changed sucessfully ");
			}
		} else {
			System.out.println("Invalid credentials");
		}

	}

}
