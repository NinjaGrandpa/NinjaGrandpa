package v37;

import java.util.Scanner;

public class l‰xa1 {
	
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String name = input1.nextLine();
		
		System.out.println("Hur gammal ‰r du?");
		String age = input1.nextLine();
		
		System.out.println("Vad ‰r din adress?");
		String adress = input1.nextLine();
		
		System.out.println("Vad ‰r ditt postnummer?");
		String postnummer = input1.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input1.nextLine();
		
		System.out.println("Vad ‰r ditt telefonnummer?");
		String telefonnummer = input1.nextLine();
		
		System.out.println("\nInformation:" + "\nNamn:\t\t" + name + "\n≈lder:\t\t" + age + "\nAdress:\t\t" + 
		adress + "\nPostnummer:\t" + postnummer + "\nStad:\t\t" + stad + "\nTelefonnummer:\t" + telefonnummer);
	}
}
