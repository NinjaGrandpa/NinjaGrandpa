package v39;

import java.util.Scanner;

public class Lektion0916Enhanced {

	public static void main(String[] args) {

		// Villkor

		boolean repeat1 = true;
		int replay1;
		int age1 = 0; // Initierat variablen "age1"
		

		Scanner input1 = new Scanner(System.in); // Gör det möjligt att få input ifrån konsolen
		Scanner input2 = new Scanner(System.in);

		while (repeat1) {

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
			} 
			else {
				System.out.println("Du får vänta " + ageLeft1 + " år innan du får köra bil och " + ageLeft2
						+ " år innan du får köra moppe.");
			}
			
			System.out.println();
			System.out.println("Vill du spela igen? \n Skriv '1' för ja eller '2' för nej");
			
			replay1 = input1.nextInt();
			
			if (replay1 != 1) {
				repeat1 = false;
				System.out.println("\nHa en medioker dag!");
			}
	
		}
	}
}