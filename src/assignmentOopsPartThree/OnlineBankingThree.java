package assignmentOopsPartThree;

import java.util.Scanner;

public class OnlineBankingThree extends BankingRules implements BankOperations {
	Scanner sc = new Scanner(System.in);
	int enteredAmount;
	double totalWithdrawal;

	public void withdrawFunds() {

		if (totalWithdrawal >= dailyWithdrawalLimit()) {
			System.out.println("You have reached your daily withdrawal limit.");
		} else {
			System.out.println("Please enter amount that you would like to withdraw");
			enteredAmount = sc.nextInt();

			if (enteredAmount > johnAdams.getTotalFundsAvailable()) {
				System.out.println(" Insufficent Funds..Please add sufficent funds to withdraw ");
			} else if (enteredAmount == 0) {
				System.out.println(" Amount must not be zero");
			} else if (totalWithdrawal + enteredAmount > 1000) {

				System.out.println(" Withdraw limit for a day is $1000 . ");

			}

			else {
				if (enteredAmount % 10 != 0) {
					System.out.println(" Amount needs to be multiple of 10");
				} else {
					johnAdams.setTotalFundsAvailable(johnAdams.getTotalFundsAvailable() - enteredAmount);
					totalWithdrawal += enteredAmount;
					System.out.println(" New Balance :$ " + johnAdams.getTotalFundsAvailable());
				}
			}
		}

	}

	@Override
	public void depositFunds() {
		System.out.println(" Please add amount that you would like to deposit");
		enteredAmount = sc.nextInt();
		johnAdams.setTotalFundsAvailable(johnAdams.getTotalFundsAvailable() + enteredAmount);
		if (enteredAmount == 0) {
			System.out.println(" Amount needs to be greater than zero");
		} else {
			System.out.println(" New balance" + johnAdams.getTotalFundsAvailable());
		}

	}

	@Override
	public int dailyWithdrawalLimit() {
		return 1000;

	}

	@Override
	public void numberOfTransactionsLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean changePinPassword(String enteredPassword) {
		if (johnAdams.getOnlinePassword().equals(enteredPassword)) {
			System.out.println(" You have logged in sucessfully ");
			return true;
		}

		else {
			for (int i = 0; i < 2; i++) {
				int maximumAttempts = 2;
				System.out.println(" Invalid pin.Please try again.Attepmts left :" + (maximumAttempts - i));

				String enterPasswordOne = sc.next();
				if (enterPasswordOne.equals(johnAdams.getOnlinePassword())) {
					System.out.println(" You have logged in sucessfully ");
                 return true;
				}
				else if (i == 1) {
					System.out.println("Account is locked");
				}

			}
		}
		return false;
	}

}
