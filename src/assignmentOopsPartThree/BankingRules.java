package assignmentOopsPartThree;

import assignmentOopsPart1.ClientAccountDetails;

public abstract class BankingRules {
	ClientAccountDetails johnAdams = new ClientAccountDetails("123456", "John Adams", 5089.10, "1234", "John123456");

	public static int dailyWithdrawalLimit() {
		return 1000;
	}

	public abstract void numberOfTransactionsLimit();

}
