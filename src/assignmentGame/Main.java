package assignmentGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ReadFile readFile = new ReadFile();
		
		readFile.readFileAndStoreInList();

		GameApplication fa = new GameApplication();

		boolean isPlayerWillingToPlayAgain = true;

		while (isPlayerWillingToPlayAgain) {
			
			fa.gameApplication(readFile);

			System.out.println(" Do you wish to play again? ");

			String answer = sc.next();

			if (answer.equalsIgnoreCase("no")) {

				System.out.println("Thank you for playing ");

				isPlayerWillingToPlayAgain = false;

			}

		}
		sc.close();
	}

}
