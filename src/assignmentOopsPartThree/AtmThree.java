package assignmentOopsPartThree;

import java.util.Scanner;

public class AtmThree extends BankingRules implements BankOperations {
	private int pin;
	private double balance;
	int enteredAmount;

	public double getBalance() {
		return balance;
	}

	Scanner sc = new Scanner(System.in);

	public AtmThree(int pin) {
		super();
		this.pin = pin;
	}

	public boolean isPinValid(int enteredPin) {
		if (pin == enteredPin) {
			System.out.println(" You have logged in sucessfully ");
			return true;
		}

		return false;
	}

	@Override
	public void dailyWithdrawalLimit(int dailyLimit) {
		dailyLimit = 1000;
	}

	@Override
	public void numberOfTransactionsLimit(int limit) {

	}

	@Override
	public void withdrawFunds() {
		System.out.println("Please enter amount that you would like to withdraw");
		enteredAmount = sc.nextInt();
		if (enteredAmount > balance) {
			System.out.println(" Entered amount is greater than Balance.Please add sufficent funds to withdraw ");
		}
		else if (enteredAmount == 0) {
			System.out.println(" Amount must not be zero");
		}
		else if (enteredAmount > 1000) {
			System.out.println(" Maximum limit is $1000");
		} 
		else {
			balance = balance - enteredAmount;
			System.out.println(" New Balance" + balance);
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

}
