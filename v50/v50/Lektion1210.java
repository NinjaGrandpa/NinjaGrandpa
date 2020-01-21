package v50;

import java.util.Scanner;

public class Lektion1210 {

	public static void main(String[] args) {

		boolean repeatMenu = true;
		int choice = 0;
		while (repeatMenu) {

			Scanner input = new Scanner(System.in);

			System.out.println();
			System.out.println("Välkommen! Välj ett av dessa alternativ");
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
				System.out.println("Skriv in ett heltal i terminalen för att välja ett alternativ.");
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

				System.out.println("Allsmäktig skapar: Max Jenslöv");
				break;

			case 5:

				System.out.println("Stänger ner...");
				repeatMenu = false;
				break;

			default:

				System.out.println("Välj mellan alternativen (1-5)");
				break;
			}
		}
	}
}
