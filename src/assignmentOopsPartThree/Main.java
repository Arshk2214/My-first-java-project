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
			if (john.changePinPassword(enteredPin)) {
				boolean continueBanking = true;
				while (continueBanking) {
					System.out.println(" Plese press 1 for withdraw ,2 for Deposit,3 for exit");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:

						john.withdrawFunds();

						break;
					case 2:
						john.depositFunds();

						break;
					case 3:
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
			if (johnOnline.changePinPassword(enteredPassword)) {
				boolean continueBanking = true;
				while (continueBanking) {
					System.out.println(" Plese press 1 for withdraw ,2 for Deposit,3 for exit");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:

						johnOnline.withdrawFunds();

						break;
					case 2:
						johnOnline.depositFunds();

						break;
					case 3:
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
