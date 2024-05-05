package assignmentOopsPartTwo;

import java.util.Scanner;

public class BankOperationssMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AtmTwo john = new AtmTwo("1234");
		OnlineBankingTwo johnOnline = new OnlineBankingTwo("John1234");
		System.out.println(" Which operation would you like to choose today ?");
		String operation = sc.next();

		switch (operation) {
		case "Atm":
			System.out.println("Enter pin   ");
			String enteredPin = sc.next();
			System.out.println(" enter pin to change");
			String newPin = sc.next();
			john.changePinPassword(enteredPin, newPin);
			break;
		case "Online":
			System.out.println("Enter password  ");
			String enteredPassword = sc.next();
			System.out.println(" Enter new password");
			String newPassword = sc.next();
			johnOnline.changePinPassword(enteredPassword, newPassword);
			break;

		default:
			System.out.println(" Invalid Entry ");
			break;
		}
		sc.close();
	}
}
