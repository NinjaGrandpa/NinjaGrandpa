package v41;

import java.util.Scanner;

public class uppgift3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int integer;
		int sum = 0;
		int mean;
		int turns = 0;
		
		System.out.println("Skriv in ett heltal:\nSkriv 0 om du vill avsluta.");
		do {
			
			integer = input.nextInt();
			
			if (integer != 0) {
				sum = sum + integer;
				turns++;
			}
			
			else {
				break;
			}
			
			
			
			
		}
		while(integer != 0);
		
		mean = sum/turns;
		System.out.println("Summa: " + sum + "\nMedelvärde: " + mean);
	}
		

}
