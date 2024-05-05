package assignmentOopsPartThree;
import java.util.Scanner;
public class OnlineBankingThree extends BankingRules implements BankOperations {
    private String password;
    private double balance;
	int enteredAmount;
	Scanner sc = new Scanner(System.in);

    public OnlineBankingThree(String password) {
		super();
		this.password = password;
	}

	public boolean isPasswordValid(String enteredPassword) {
		if (password.equals(enteredPassword)) {
			return true;
		}
		return false;
	}
	
    
	

	public void withdrawFunds() {
		System.out.println("Please enter amount that you would like to withdraw");
		enteredAmount = sc.nextInt();
		if (enteredAmount < balance || enteredAmount == 0) {
			balance = balance - enteredAmount;
			System.out.println(" New Balnce" + balance);
		} else {
			System.out.println(" Please deposit funds to withdraw or amount must not be zero");
		}
	}

	@Override
	public void depositFunds() {
		System.out.println(" Please add amount that you would like to deposit");
		enteredAmount = sc.nextInt();
		balance = enteredAmount + balance;
		if (enteredAmount == 0) {
			System.out.println(" Amount needs to be greater than zero");
		} else {
			System.out.println(" New balance" + balance);
		}

}

	@Override
	public void dailyWithdrawalLimit(int dailyLimit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void numberOfTransactionsLimit(int limit) {
		// TODO Auto-generated method stub
		
	}
}
