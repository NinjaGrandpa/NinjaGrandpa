package v38;

import java.util.Scanner;

public class lektion0916 {

	public static void main(String[] args) {

		// Villkor

		boolean again1 = true;
		boolean svar1 = true;
		int age1 = 0; // Initierat variablen "age1"
		String yesorno1 = "Y";
		String answer1 = "Y";

		Scanner input1 = new Scanner(System.in); // G�r det m�jligt att f� input ifr�n konsolen
		Scanner input2 = new Scanner(System.in);

		// while (yesorno1 == answer1) { Skrive som kommentar f�r att koden inte fungerar i nul�get

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
		} else {
			System.out.println("Du f�r v�nta " + ageLeft1 + " �r innan du f�r k�ra bil och " + ageLeft2
					+ " �r innan du f�r k�ra moppe.");
		}

		//System.out.println("Vill du fr�ga om �lder igen? Skriv (Y) om ja, (N) om nej");
		// answer1 = input2.nextLine();
	}
}
