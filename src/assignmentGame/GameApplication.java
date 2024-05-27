package assignmentGame;

import java.util.ArrayList;

import java.util.Scanner;

public class GameApplication {

	Scanner sc = new Scanner(System.in);

	public void gameApplication(ReadFile readfile) {
		final int maximunGuess = 5;

		String alphabet;

		int wrongGuess = 0;

		int correctGuesses = 0;

		String guess;

		ArrayList<Character> storeWrongGuess = new ArrayList<>();

		String name = readfile.selectRandomName();

		String changedName = name.replaceAll("[a-zA-Z]", "-");

		System.out.println("You are guessing " + changedName);

		System.out.println(" You have guessed (0) wrong letters:");

		while (wrongGuess < maximunGuess) {

			System.out.println("Guess a letter:");

			alphabet = sc.next();

			char alphabetOne = alphabet.charAt(0);

			char[] selectedName = name.toCharArray();

			boolean isGuessCorrect = false;

			for (int i = 0; i < selectedName.length; i++) {

				if (Character.toLowerCase(selectedName[i]) == Character.toLowerCase(alphabetOne)) {

					changedName = changedName.substring(0, i) + alphabetOne + changedName.substring(i + 1);

					System.out.println("You are guessing:" + changedName);

					System.out.println("You have guessed " + wrongGuess + " wrong letters:");

					correctGuesses++;

					isGuessCorrect = true;

				}
			}

			if (!isGuessCorrect) {
				wrongGuess++;

				storeWrongGuess.add(alphabetOne);

				guess = storeWrongGuess.toString();

				System.out.println("You are guessing " + changedName);

				System.out.println("You have guessed " + wrongGuess + " wrong letters:" + guess);

			}
			if (correctGuesses == changedName.length()) {

				System.out.println("---Huraah! you have won the game---");

				System.out.println("You have guessed the word " + name + " correctly");

				break;

			}
			if (wrongGuess == 5) {

				System.out.println("Game Over! You've used all your chances.");

				break;
			}

		}

	}

}
