package assignmentOopsPartThree;

import assignmentOopsPart1.ClientAccountDetails;

public abstract class BankingRules extends ClientAccountDetails {

	public BankingRules(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber, nameOfAccountHolder, totalFundsAvailable, pin, onlinePassword);
		// TODO Auto-generated constructor stub
	}

	public abstract int dailyWithdrawalLimit(int dailyLimit);

	public abstract void numberOfTransactionsLimit(int limit);

}
