package assignmentOopsPartTwo;

import java.util.Scanner;

public class BankOperationssMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AtmTwo john = new AtmTwo("123456", "John Adams", 5089.10, "1234", "John123456");
		OnlineBankingTwo johnOnline = new OnlineBankingTwo("123456", "John Adams", 5089.10, "1234", "John123456");
		System.out.println(" Which operation would you like to choose today ?");
		String operation = sc.next();

		switch (operation) {
		case "Atm":
			System.out.println("Enter pin   ");
			String enteredPin = sc.next();

			john.changePinPassword(enteredPin);
			break;
		case "Online":
			System.out.println("Enter password  ");
			String enteredPassword = sc.next();
			johnOnline.changePinPassword(enteredPassword);
			break;

		default:
			System.out.println(" Invalid Entry ");
			break;
		}
		sc.close();
	}
}
