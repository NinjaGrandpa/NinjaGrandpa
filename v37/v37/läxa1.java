package v37;

import java.util.Scanner;

public class läxa1 {
	
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String name = input1.nextLine();
		
		System.out.println("Hur gammal är du?");
		String age = input1.nextLine();
		
		System.out.println("Vad är din adress?");
		String adress = input1.nextLine();
		
		System.out.println("Vad är ditt postnummer?");
		String postnummer = input1.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input1.nextLine();
		
		System.out.println("Vad är ditt telefonnummer?");
		String telefonnummer = input1.nextLine();
	}
}
