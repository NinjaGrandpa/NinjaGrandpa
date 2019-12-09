package v48;

import java.util.Arrays;

public class läxa6 {

	/**
	 * Uppgift 1 - Skriver ut antalet 7:or i arrayen "numbers"
	 * 
	 * @param numbers
	 * @return
	 */

	private static int amount7(int[] numbers) {

		int amount = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 7) {
				amount++;
			}
		}

		return amount;
	}

	/**
	 * Uppgift 2 - Skriver ut antalet "Tom" i arrayen "names"
	 * 
	 * @param names
	 * @return
	 */

	private static int amountTom(String[] names) {

		int amount = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i] == "Tom") {
				amount++;
			}

		}

		return amount;
	}

	/**
	 * Uppgift 3 - Skriver ut det största antalet av ett heltal ifrån arrayen
	 * "numbers"
	 * 
	 * @param numbers
	 * @return
	 */

	private static int mostNumber(int[] numbers) {

		int most = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			int amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}

			if (amount > max) {
				most = i;
				amount = max;
			}

		}

		return most;
	}

	/**
	 * Uppgift 4 - Skriver ut indexen på namnet "Drusilla" i arrayn "names"
	 * 
	 * @param names
	 * @return
	 */

	private static int indexDrusilla(String[] names) {

		int index = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i] == "Drusilla") {
				index = i;
				break;
			}
		}

		return index;
	}

	/**
	 * Uppgift 5 - Räknar ut summan av alla jämna tal i arrayen i "numbers"
	 * 
	 * @param numbers
	 * @return
	 */

	private static int sumEven(int[] numbers) {

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * Uppgift 6 - Skriver ut en array med antalet av varje siffra i arrayen
	 * "numbers".
	 * 
	 * @param numbers
	 * @return
	 */

	private static String amountNumbers(int[] numbers) {

		int[] amount = new int[10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < numbers.length; j++) {

				if (numbers[j] == i) {

					amount[i]++;

				}

			}
		}

		return Arrays.toString(amount);
	}

	/**
	 * Uppgift 7 - Hittar antalet namn som börjar med bokstaven "L".
	 * @param names
	 * @return
	 */
	
	private static int amountL(String[] names) {

		int amount = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("L")) {
				amount++;
			}
		}

		return amount;
	}

	/**
	 * Uppgift 8 - Hittar antalet namn som är 5 bokstäver långa.
	 * @param names
	 * @return
	 */
	
	private static int length5(String[] names) {
		
		int amount = 0;
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 5) {
				amount++;
			}
		}
		return amount++;
	}
	
	public static void main(String[] args) {

		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println(amount7(numbers));
		System.out.println(amountTom(names));
		System.out.println(mostNumber(numbers));
		System.out.println(indexDrusilla(names));
		System.out.println(sumEven(numbers));
		System.out.println(amountNumbers(numbers));
		System.out.println(amountL(names));
		System.out.println(length5(names));
	}
}
