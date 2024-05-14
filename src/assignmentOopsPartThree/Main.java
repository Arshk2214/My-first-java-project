package assignmentOopsPartThree;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AtmThree john = new AtmThree();
		OnlineBankingThree johnOnline = new OnlineBankingThree();
		System.out.println(" Which operation would you like to choose today ?(Atm/Online)");
		String operation = sc.next();
		if (operation.equals("Atm")) {
			System.out.println(" Please enter pin ");
			String enteredPin = sc.next();
			if (john.johnAdams.isPinValid(enteredPin)) {
				boolean continueBanking = true;
				while (continueBanking) {
					System.out.println(
							" Plese press 1 for withdraw ,2 for Deposit,3 for Change Pin/Password,4 for Balance,5 For withdrawal limit,6 for exit ");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:

						john.withdrawFunds();

						break;

					case 2:
						john.depositFunds();

						break;
					case 3:
						john.changePinPassword(enteredPin);

						break;
					case 4:

						System.out.println(" Balance is: $ " + john.johnAdams.getTotalFundsAvailable());
						break;
					case 5:

						System.out.println(" Daily withdrawal limit $ " + BankingRules.dailyWithdrawalLimit());
						break;
					case 6:
						continueBanking = false;
						System.out.println(" Thankyou for choosing our bank.");
						break;

					default:
						System.out.println("invalid choice");
						break;
					}
				}
			}

		}
		if (operation.equals("Online")) {
			System.out.println(" Please enter password ");
			String enteredPassword = sc.next();
			if (johnOnline.johnAdams.isPasswordValid(enteredPassword)) {
				boolean continueBanking = true;
				while (continueBanking) {
					System.out.println(
							" Plese press 1 for withdraw ,2 for Deposit,3 for Change Pin/Password,4 for Balance,5 For withdrawal limit,6 for exit ");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:

						johnOnline.withdrawFunds();

						break;
					case 2:
						johnOnline.depositFunds();

						break;
					case 3:
						johnOnline.changePinPassword(enteredPassword);

						break;
					case 4:

						System.out.println(" Balance is: $ " + johnOnline.johnAdams.getTotalFundsAvailable());
						break;
					case 5:

						System.out.println(" Daily withdrawal limit $ " + BankingRules.dailyWithdrawalLimit());
						break;
					case 6:
						continueBanking = false;
						System.out.println(" Thankyou for choosing our bank.");
						break;
					default:
						System.out.println("invalid choice");
						break;
					}

				}

			}

		}

		sc.close();
	}

}
