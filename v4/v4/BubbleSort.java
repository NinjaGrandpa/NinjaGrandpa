package v4;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int interval = input.nextInt();
		int amount = input.nextInt();
		int[] numbers = randomArray(interval, amount);
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.toString(sortingAlgorithm(numbers)));
	}

	/**
	 * Skapar en slumpmässig array
	 * 
	 * @param interval
	 * @param amount
	 * @return
	 */

	private static int[] randomArray(int interval, int amount) {

		int[] numbers = new int[interval];
		boolean swapped;
		int temp;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * amount);
		}

		return numbers;
	}

	/**
	 * Sorterar en array fylld med heltal
	 * @param numbers
	 * @return
	 */
	
	private static int[] sortingAlgorithm(int[] numbers) {

		int temp;
		boolean swapped;

		do {
			swapped = false;

			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);

		return numbers;
	}
}
