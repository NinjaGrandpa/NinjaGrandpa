package v50;

import java.util.Scanner;

public class Lektion1210 {

	public static void main(String[] args) {

		boolean repeatMenu = true;
		int choice = 0;
		while (repeatMenu) {

			Scanner input = new Scanner(System.in);

			System.out.println();
			System.out.println("V�lkommen! V�lj ett av dessa alternativ");
			System.out.println("(1) - New Game");
			System.out.println("(2) - Load Game");
			System.out.println("(3) - Options");
			System.out.println("(4) - Credits");
			System.out.println("(5) - Quit");
			System.out.println();

			try {

				choice = input.nextInt();
			}

			catch (Exception e) {
				System.out.println("Skriv in ett heltal i terminalen f�r att v�lja ett alternativ.");
			}

			switch (choice) {
			case 1:

				System.out.println("Spelet laddar...");
				repeatMenu = false;
				break;

			case 2:

				System.out.println("Du har inga sparade spel.");
				break;

			case 3:

				System.out.println("Starta spelet bara!");
				break;

			case 4:

				System.out.println("Allsm�ktig skapar: Max Jensl�v");
				break;

			case 5:

				System.out.println("St�nger ner...");
				repeatMenu = false;
				break;

			default:

				System.out.println("V�lj mellan alternativen (1-5)");
				break;
			}
		}
	}
}
