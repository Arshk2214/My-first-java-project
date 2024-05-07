package assignmentOopsPartThree;

import java.util.Scanner;

public class AtmThree extends BankingRules implements BankOperations {
	Scanner sc=new Scanner(System.in);
	int totalWithdrawal;
	int enteredAmount;
	public AtmThree(String accountNumber, String nameOfAccountHolder, double totalFundsAvailable, String pin,
			String onlinePassword) {
		super(accountNumber,nameOfAccountHolder,totalFundsAvailable,pin,onlinePassword);
		// TODO Auto-generated constructor stub
	}

	public boolean isPinValid(String enteredPin) {
		if (pin == enteredPin) {
			System.out.println(" You have logged in sucessfully ");
			return true;
		} else {
			for (int i = 0; i < 2; i++) {
				int maximumAttempts = 2;
				System.out.println(" Invalid pin.Please try again.Attepmts left :" + (maximumAttempts - i));

				String enterPin = sc.next();
				if (enterPin == pin) {
					System.out.println(" You have logged in sucessfully ");
					return true;
				}
				if (i == 1) {
					System.out.println("Account is locked");
				}
			}
		}
		return false;
	}

	@Override
	public int dailyWithdrawalLimit(int dailyLimit) {
		dailyLimit = 1000;
		return dailyLimit;
	}

	@Override
	public void numberOfTransactionsLimit(int limit) {

	}

	@Override
	public void withdrawFunds(double totalFundsAvailable) {

		if (totalWithdrawal >= 1000) {
			System.out.println("You have reached your daily withdrawal limit.");
		} else {
			System.out.println("Please enter amount that you would like to withdraw");
			 enteredAmount = sc.nextInt();

			if (enteredAmount >  totalFundsAvailable) {
				System.out.println(" Insufficent Funds..Please add sufficent funds to withdraw ");
			} else if (enteredAmount == 0) {
				System.out.println(" Amount must not be zero");
			}

			else if (totalWithdrawal + enteredAmount > 1000) {

				System.out.println(" Withdraw limit for a day is $1000 .");

			}

			else {
				if (enteredAmount % 10 != 0) {
					System.out.println(" Amount needs to be multiple of 10");
				} else {
					 totalFundsAvailable =  totalFundsAvailable - enteredAmount;
					totalWithdrawal += enteredAmount;
					System.out.println(" New Balance :$ " +  totalFundsAvailable);
				}
			}

		}

	}

	@Override
	public void depositFunds( double totalFundsAvailable) {
		System.out.println(" Please add amount that you would like to deposit");
		enteredAmount = sc.nextInt();
		totalFundsAvailable = enteredAmount + totalFundsAvailable;
		if (enteredAmount == 0) {
			System.out.println(" Amount needs to be greater than zero");
		} else {
			System.out.println(" New balance :$ " + totalFundsAvailable);
		}
	}

}
