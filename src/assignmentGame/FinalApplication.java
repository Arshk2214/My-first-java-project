package assignmentGame;

import java.util.ArrayList;

import java.util.Scanner;

public class FinalApplication {
	String alphabet;
	int wrongGuess = 0;
	int correctGuesses = 0;
	Scanner sc = new Scanner(System.in);
	ArrayList<Character> storeWrongGuess = new ArrayList<>();

	public void gameApplication(ReadFile readfile) {

		String name = readfile.selectRandomName();

		String changedName = name.replaceAll("[a-zA-Z]", "-");

		System.out.println("You are guessing " + changedName);

		System.out.println(" You have guessed (0) wrong letters:");

		while (wrongGuess < 5) {

			System.out.println("Guess a letter:");

			alphabet = sc.next();

			char result = alphabet.charAt(0);

			char[] selectedName = name.toCharArray();

			boolean isGuessCorrect = false;

			for (int i = 0; i < selectedName.length; i++) {

				if (Character.toLowerCase(selectedName[i]) == Character.toLowerCase(result)) {

					changedName = changedName.substring(0, i) + result + changedName.substring(i + 1);

					System.out.println("You are guessing:" + changedName);

					System.out.println("You have guessed " + wrongGuess + " wrong letters:");

					correctGuesses++;

					isGuessCorrect = true;

				}
			}
			if (!isGuessCorrect) {
				wrongGuess++;

				storeWrongGuess.add(result);

				System.out.println("You are guessing " + changedName);

				System.out.println("You have guessed " + wrongGuess + " wrong letters:" + storeWrongGuess.toString());

			}
			if (correctGuesses == changedName.length()) {

				System.out.println(" You win");

				System.out.println(" Congrats you have guessed the word " + name + " correctly");

				break;

			}
			if (wrongGuess == 5) {

				System.out.println("Game Over! You've used all your chances.");

				break;
			}

		}
		sc.close();

	}

}
