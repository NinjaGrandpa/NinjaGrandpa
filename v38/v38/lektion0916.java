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

		Scanner input1 = new Scanner(System.in); // Gör det möjligt att få input ifrån konsolen
		Scanner input2 = new Scanner(System.in);

		// while (yesorno1 == answer1) { Skrive som kommentar för att koden inte fungerar i nuläget

		System.out.println("Hur gammal är du?");
		age1 = input1.nextInt();

		int ageLeft1 = 18 - age1;
		int ageLeft2 = 15 - age1;

		if (age1 >= 18) {
			System.out.println("Du är gammal nog att köra bil");
			System.out.println("Du får också köra moppen.(Det är dock inte lika coolt som bil.)");
		}

		else if (age1 > 15 && age1 < 18) {
			System.out.println(
					"Du får köra moppe men inte bil. Det är dock bara " + ageLeft1 + " år kvar tills du får köra bil.");
		} else {
			System.out.println("Du får vänta " + ageLeft1 + " år innan du får köra bil och " + ageLeft2
					+ " år innan du får köra moppe.");
		}

		//System.out.println("Vill du fråga om ålder igen? Skriv (Y) om ja, (N) om nej");
		// answer1 = input2.nextLine();
	}
}
