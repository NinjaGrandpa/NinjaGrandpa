package v8;

import java.util.Scanner;

public class Experiment {

	public static void main(String[] args) {
		// Skapar en instans av Scanner
		Scanner input = new Scanner(System.in);

		// Deklarerar variabler
		String apa;
		char[] cepa = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		char[] bepa;
		String depa;
		char[] epa = new char[2];
		String fepa;
		int hepa;

		// Tar in en input
		apa = input.nextLine();

		// Gör om apa till en charArray
		bepa = apa.toCharArray();

		for (int i = 0; i < bepa.length; i++) {
			for (int j = 0; j < cepa.length; j++) {
				if (bepa[i] == cepa[j]) {
					int k = 0;
					k++;
					epa[k] = cepa[i];
					
				}
			}
		}
		fepa = new String(epa);
		
		hepa = Integer.parseInt(fepa);
		System.out.println("hepa");
	}

}
