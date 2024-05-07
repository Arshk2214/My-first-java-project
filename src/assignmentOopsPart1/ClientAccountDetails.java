package assignmentOopsPart1;

public class ClientAccountDetails {
	private String accountNumber;
	private String nameOfAccountHolder;
	private double totalFundsAvailable;
	protected String pin;
	protected String onlinePassword;

	public ClientAccountDetails(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super();
		this.accountNumber = accountNumber;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
		this.pin = pin;
		this.onlinePassword = onlinePassword;
	}

	

	public boolean isPinValid(String enteredPin) {

		if (pin.equals(enteredPin)) {
			return true;
		}
		return false;
	}

	public boolean isPasswordValid(String enteredPassword) {

		if (onlinePassword.equals(enteredPassword)) {
			return true;
		}
		return false;
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

	
}
