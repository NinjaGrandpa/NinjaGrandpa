package v39;

import java.util.Scanner;

public class Lektion0916Enhanced {

	public static void main(String[] args) {

		// Villkor

		boolean repeat1 = true;
		int replay1;
		int age1 = 0; // Initierat variablen "age1"
		

		Scanner input1 = new Scanner(System.in); // G�r det m�jligt att f� input ifr�n konsolen
		Scanner input2 = new Scanner(System.in);

		while (repeat1) {

			System.out.println("Hur gammal �r du?");
			age1 = input1.nextInt();

			int ageLeft1 = 18 - age1;
			int ageLeft2 = 15 - age1;

			if (age1 >= 18) {
				System.out.println("Du �r gammal nog att k�ra bil");
				System.out.println("Du f�r ocks� k�ra moppen.(Det �r dock inte lika coolt som bil.)");
			}

			else if (age1 > 15 && age1 < 18) {
				System.out.println(
						"Du f�r k�ra moppe men inte bil. Det �r dock bara " + ageLeft1 + " �r kvar tills du f�r k�ra bil.");
			} 
			else {
				System.out.println("Du f�r v�nta " + ageLeft1 + " �r innan du f�r k�ra bil och " + ageLeft2
						+ " �r innan du f�r k�ra moppe.");
			}
			
			System.out.println();
			System.out.println("Vill du spela igen? \n Skriv '1' f�r ja eller '2' f�r nej");
			
			replay1 = input1.nextInt();
			
			if (replay1 != 1) {
				repeat1 = false;
				System.out.println("\nHa en medioker dag!");
			}
	
		}
	}
}