package v43;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		
		twoIntegers();
	}

	/**
	 * Skriver tv� heltal och skickar vidare dem till metoden ifInteger.
	 */
	public static void twoIntegers() {
		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in tv� heltal:");

		int integer1 = input.nextInt();
		int integer2 = input.nextInt();

		System.out.println(ifInteger(integer1, integer2));

	}

	/**
	 * J�mf�r tv� olika heltal och best�mmer vilket som �r st�rst och vilket som �r
	 * minst. Samt skickar tillbaka en h�lsning.
	 * 
	 * @param integer1
	 * @param integer2
	 * @return
	 */
	static String ifInteger(int integer1, int integer2) {

		if (integer1 > integer2) {
			System.out.println("Minsta talet �r " + integer2);
			System.out.println("St�rsta talet �r " + integer1);
		} else {
			System.out.println("Minsta talet �r " + integer1);
			System.out.println("St�rsta talet �r " + integer2);
		}

		String hello = "Metoden �r klar";

		return hello;
	}
}
