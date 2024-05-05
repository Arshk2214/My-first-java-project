package assignmentOopsPart1;

import java.util.Scanner;

public class BankOperationMain {
	public static void main(String[] args) {

		ClientAccountDetails johnAdams = new ClientAccountDetails("123456", "John Adams", 5089.10, 1234, "John123456");
		BankOperation atm = new Atm();
		BankOperation online = new OnlineBanking();
		Scanner sc = new Scanner(System.in);
		System.out.println(" which operation would you like to perform today?");
		String answer = sc.next();
		System.out.println(" what service would you like to do ?");
		String service = sc.next();

		if (answer.equals("atm") && service.equals("withdraw")) {

			System.out.println(" Enter pin ");

			int enteredPin = sc.nextInt();
			if (johnAdams.isPinValid(enteredPin))

			{ // casting((sub class)object).method(arguments);

				((Atm) atm).withdrawFunds(johnAdams.getTotalFundsAvailable());
			} else {
				System.out.println(" invalid Credentials");
			}
		} else if (answer.equals("atm") && service.equals("deposit")) {
			System.out.println(" Enter pin ");
			int enteredPin = sc.nextInt();
			if (johnAdams.isPinValid(enteredPin))

			{
				((Atm) atm).depositFunds(johnAdams.getTotalFundsAvailable());
			} else {
				System.out.println(" invalid Credentials");
			}
		}

		else if (answer.equals("online") && service.equals("deposit")) {

			System.out.println(" Enter password ");
			String enteredPassword = sc.next();
			if (johnAdams.isPasswordValid(enteredPassword)) {

				((OnlineBanking) online).depositFunds(johnAdams.getTotalFundsAvailable());
			} else {
				System.out.println(" invalid Credentials");
			}
		}

		else if (answer.equals("online") && service.equals("withdraw")) {
			System.out.println(" Enter password ");
			String enteredPassword = sc.next();
			if (johnAdams.isPasswordValid(enteredPassword)) {

				((OnlineBanking) online).withdrawFunds(johnAdams.getTotalFundsAvailable());
			} else {
				System.out.println(" invalid Credentials");
			}

		}
		sc.close();

	}
}
