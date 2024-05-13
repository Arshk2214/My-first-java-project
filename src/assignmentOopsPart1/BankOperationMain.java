package assignmentOopsPart1;

import java.util.Scanner;

public class BankOperationMain {
	public static void main(String[] args) {

		BankOperation bankoperation;
		Scanner sc = new Scanner(System.in);
		System.out.println(" which operation would you like to perform today?(atm/online)");
		String answer = sc.next();
		System.out.println(" what service would you like to do ?(withdraw/deposit//balance)");
		String service = sc.next();

		if (answer.equals("atm") && service.equals("withdraw")) {
			bankoperation = new Atm();
			System.out.println(" Enter pin ");

			String enteredPin = sc.next();
			if (bankoperation.johnAdams.isPinValid(enteredPin))

			{
				bankoperation.withdrawFunds();
			}
		} else if (answer.equals("atm") && service.equals("deposit")) {
			bankoperation = new Atm();
			System.out.println(" Enter pin ");
			String enteredPin = sc.next();
			if (bankoperation.johnAdams.isPinValid(enteredPin))

			{
				bankoperation.depositFunds();
			}
		}

		else if (answer.equals("online") && service.equals("deposit")) {
			bankoperation = new OnlineBanking();
			System.out.println(" Enter password ");
			String enteredPassword = sc.next();
			if (bankoperation.johnAdams.isPasswordValid(enteredPassword)) {
				bankoperation.depositFunds();
			}
		}

		else if (answer.equals("online") && service.equals("withdraw")) {
			bankoperation = new OnlineBanking();
			System.out.println(" Enter password ");
			String enteredPassword = sc.next();
			if (bankoperation.johnAdams.isPasswordValid(enteredPassword)) {

				bankoperation.withdrawFunds();
			}
		} else if (answer.equals("atm") && service.equals("balance")) {
			bankoperation = new Atm();
			System.out.println(" Enter pin ");

			String enteredPin = sc.next();
			if (bankoperation.johnAdams.isPinValid(enteredPin))

			{

				System.out.println(" Balance is:" + bankoperation.johnAdams.getTotalFundsAvailable());
			} else {
				System.out.println(" invalid Credentials");
			}

		} else if (answer.equals("online") && service.equals("balance")) {
			bankoperation = new OnlineBanking();
			System.out.println(" Enter password ");
			String enteredPassword = sc.next();
			if (bankoperation.johnAdams.isPasswordValid(enteredPassword)) {

				System.out.println(" Balance is:" + bankoperation.johnAdams.getTotalFundsAvailable());
			}
		}

		sc.close();

	}
}
