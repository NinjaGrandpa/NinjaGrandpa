package v8;

import java.util.Scanner;
import java.util.Random;

public class Talspelet {
	public static void main(String[] args) {

		// Initializing Scanner
		Scanner input = new Scanner(System.in);

		// Initializing variables
		String guess;
		int guessInteger;
		int tries;
		int randomInt;

		do {

			// Calls on the WelcomeMenu and sends an input to DifficultyMenu,
			// returning a welcome message and a number of tries
			WelcomeMenu();
			tries = DifficultyMenu();
			randomInt = RandomNumberGenerator();

			// If-satser som jämför "guess" med det slumpmässiga talet

			System.out.println("Guess the number!");
			while (tries > 0) {

				System.out.println("You have " + tries + " tries left.");
				guess = input.nextLine();
				guessInteger = Integer.parseInt(guess);
				

				if (guessInteger < 1 || guessInteger > 100) {
					System.out.println("The number is an integer between 1-100.");
				}

				else if (guessInteger == randomInt) {
					System.out.println("Well done!");
					break;
				}

				else if (guessInteger < randomInt) {
					System.out.println("Too low");
					tries--;
				}

				else if (guessInteger > randomInt) {
					System.out.println("Too high!");
					tries--;
				}

			}

			System.out.println("The number was " + randomInt + "!");
			System.out.println("Game over!");

		} while (tries == tries);

	}

	/**
	 * Prints a welcome message and shows the menu
	 */
	private static void WelcomeMenu() {
		System.out.println("Welcome to this game!");
		System.out.println("Choose a difficult level to start");
		System.out.println("[1] Easy - 10 tries before game over");
		System.out.println("[2] Normal - 5 tries before game over");
		System.out.println("[3] Hard - 3 tries before game over");
		System.out.println("[4] Exit game");
	}

	/**
	 * Takes in an input from console and then returns the a number of tries based
	 * on the difficulty chosen
	 * @param difficultyInput
	 * @return
	 */
	private static int DifficultyMenu() {

		// Creating a new instance of the class Scanner
		Scanner input = new Scanner(System.in);
		
		// Initializing variables
		int tries = 0;
		boolean end = false;
		String difficultyInput;

		do {

			// If-sats som avgör svårhetsgrad
			
			difficultyInput = input.nextLine();
			
			if (difficultyInput.equalsIgnoreCase("1")) {
				tries = 10;
				end = true;
			}

			else if (difficultyInput.equalsIgnoreCase("2")) {
				tries = 5;
				end = true;
			}

			else if (difficultyInput.equalsIgnoreCase("3")) {
				tries = 3;
				end = true;
			}

			else if (difficultyInput.equalsIgnoreCase("4")) {
				System.exit(0);
			}
			
			else {
				System.out.println("Write an integer between 1-4!");
			}
			
		} while (!end);
		return tries;
	}

	/**
	 * Creates a random integer from 0 to 100
	 * 
	 * @return
	 */
	private static int RandomNumberGenerator() {
		// New instance of the class Random
		Random rand = new Random();

		// The highest integer created
		int max = 100;
		int randomInt = rand.nextInt(max);

		return randomInt;
	}

}
