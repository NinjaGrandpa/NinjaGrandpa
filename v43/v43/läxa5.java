package v43;

import java.util.Scanner;

public class läxa5 {

	public static void main(String[] args) {
		
		lol();
		max();
		count();
		kelvinToCelsius();
		fahrenheitToCelsius();
		ageControl();
		stair();
		
	}
	
/**
 * Skriver ut HAHAHAHAHAHAHA
 */

	static void lol() {
		System.out.println("HAHAHAHAHAHAHA");
	}
	
/**
 * Tar in två tal och skriver ut det största
 */
	
	static void max() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in två heltal.");
		
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();
		int biggestInt;
		
		if (integer1 > integer2) {
			biggestInt = integer1;
		}
		
		else {
			biggestInt = integer2;
		}
		
		System.out.println(biggestInt);
	}

/**
 * Skriver ut alla siffror mellan 1 och "number"
 */
	
	static void count() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv i ett heltal.");
		
		int number = input.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}
		
	}

/**
 * Tar in temp. i Kelvin och skriver ut i grader Celsius
 */
	
	static void kelvinToCelsius() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in tempratur i Kelvin");
		
		double kelvin;
		double celsius;
		
		kelvin = input.nextDouble();
		
		celsius = kelvin - 273.15;
		
		System.out.println(celsius);
	}

/**
 * Tar in temp. i grader Fahrenheit och skriver ut i grader Celsius
 */
	
	static void fahrenheitToCelsius() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in en tempratur i fahrenheit.");
		
		double fahrenheit;
		double celsius;
		
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32)/1.8;
		
		System.out.println(celsius);
		
	}
	
/**
 * Ger olika outputs beroende på din ålder
 */
	
	static void ageControl() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in en ålder.");
		
		int age;
		
		age = input.nextInt();
		
		if (age <= 5) {
			System.out.println("Småbarn får int göra något.");
		}
		
		if (age > 5 && age < 13) {
			System.out.println("Du får spela Fortnite.");
		}
		
		if (age > 12 && age < 15) {
			System.out.println("Du är tonåring.");
		}
		
		if (age > 14 && age < 18) {
			System.out.println("Du får köra moppe.");
		}
		
		if (age > 17 && age < 21) {
			System.out.println("Du får köra bil.");
		}
		
		if (age > 20 && age < 65) {
			System.out.println("Du får vuxenstraff om du gör något dumt.");
		}
		
		if (age > 64 && age < 100) {
			System.out.println("Du är pensionär.");
		}
		
		if (age > 99) {
			System.out.println("R.I.P?");
		}
	}
	
/**
 * Skapar en trappa med steg beroende på vilket heltal som skrivs in
 */
	
	static void stair() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in ett heltal och bygg en trappa");
		
		int stairs = input.nextInt();
		
		for (int i = 1; i <= stairs; i++) {
			
			for (int j=1; j <= stairs-1; j++) {
				System.out.print(" ");
			}

			for (int k=1; k<=i;k++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
	}
}


