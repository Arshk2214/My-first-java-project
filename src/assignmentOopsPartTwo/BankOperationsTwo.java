package assignmentOopsPartTwo;

import assignmentOopsPart1.ClientAccountDetails;

public abstract class BankOperationsTwo extends ClientAccountDetails {

	public BankOperationsTwo(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);
		// TODO Auto-generated constructor stub
	}

	public abstract boolean changePinPassword(String enteredPin);

	public void withdrawFunds() {

	}

	public void depositFunds() {

	}

}
