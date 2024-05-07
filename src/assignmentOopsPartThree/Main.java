package assignmentOopsPartThree;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);

		AtmThree john = new AtmThree("123456", "John Adams", 5089.10, "1234", "John123456");
		OnlineBankingThree johnOnline = new OnlineBankingThree("123456", "John Adams", 5089.10, "1234", "John123456");
		System.out.println(" Which operation would you like to choose today ?");
		String operation = sc.next();
		if (operation.equals("Atm")) {
			System.out.println(" Please enter pin ");
			String enteredPIn = sc.next();
			if (john.isPinValid(enteredPIn)) {
				boolean continueBanking = true;
				while (continueBanking) {
					System.out.println(" Plese press 1 for withdraw ,2 for Deposit,3 for exit");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:

						john.withdrawFunds(john.getTotalFundsAvailable());

						break;
					case 2:
						john.depositFunds(john.getTotalFundsAvailable());

						break;
					case 3:
						continueBanking = false;
						break;
					default:
						System.out.println("invalid choice");
						break;
					}
				}
			}
			System.out.println(" Thankyou for choosing our bank.");
		}
		if (operation.equals("Online")) {
			System.out.println(" Please enter password ");
			String enteredPassword = sc.next();
			if (johnOnline.isPasswordValid(enteredPassword)) {
				boolean continueBanking = true;
				while (continueBanking) {
					System.out.println(" Plese press 1 for withdraw ,2 for Deposit,3 for exit");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:

						johnOnline.withdrawFunds(johnOnline.getTotalFundsAvailable());

						break;
					case 2:
						johnOnline.depositFunds(johnOnline.getTotalFundsAvailable());

						break;
					case 3:
						continueBanking = false;
						break;
					default:
						System.out.println("invalid choice");
						break;
					}

				}
				System.out.println(" Thankyou for choosing our bank.");
			}

		}
		sc.close();
	}

}
