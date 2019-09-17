package v38;

import java.util.Scanner;

public class Läxa2 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		float storstatal1 = 0f;
		float minstatal1 = 0f;
		
		System.out.println("Skriv in 5 heltal: ");
		float heltal1 = input1.nextFloat();
		float heltal2 = input1.nextFloat();
		float heltal3 = input1.nextFloat();
		float heltal4 = input1.nextFloat();
		float heltal5 = input1.nextFloat();
		
		if (heltal1 >= heltal2 && heltal1 >= heltal3 && 
			heltal1 >= heltal4 && heltal1 >= heltal5) {
			storstatal1 = heltal1;	
		}
		if (heltal1 <= heltal2 && heltal1 <= heltal3 &&
			heltal1 <= heltal4 && heltal1 <= heltal5) {
			minstatal1 = heltal1;
		}
		if (heltal2 >= heltal1 && heltal2 >= heltal3 && 
			heltal2 >= heltal4 && heltal2 >= heltal5) {
			storstatal1 = heltal2;
		}
		if (heltal2 <= heltal1 && heltal2 <= heltal3 &&
			heltal2 <= heltal4 && heltal2 <= heltal5) {
			minstatal1 = heltal2;
		}
		if (heltal3 >= heltal1 && heltal3 >= heltal2 && 
			heltal3 >= heltal4 && heltal3 >= heltal5) {
			storstatal1 = heltal3;	
		}
		if (heltal3 <= heltal1 && heltal3 <= heltal2 && 
			heltal3 <= heltal4 && heltal3 <= heltal5) {
			minstatal1 = heltal3;	
		}
		if (heltal4 >= heltal1 && heltal4 >= heltal2 && 
			heltal4 >= heltal3 && heltal4 >= heltal5) {
			storstatal1 = heltal4;	
		}
		if (heltal4 <= heltal1 && heltal4 <= heltal2 && 
			heltal4 <= heltal3 && heltal4 <= heltal5) {
			minstatal1 = heltal4;	
		}
		if (heltal5 >= heltal1 && heltal5 >= heltal2 && 
			heltal5 >= heltal3 && heltal5 >= heltal4) {
			storstatal1 = heltal5;	
		}
		if (heltal5 <= heltal1 && heltal5 <= heltal2 && 
			heltal5 <= heltal3 && heltal5 <= heltal4) {
			minstatal1 = heltal5;	
		}
		
		int intStorstatal1 = (int) storstatal1;
		int intMinstatal1 = (int) minstatal1;
		
		float medelvarde1 = ((heltal1 + heltal2 + heltal3 + 
				heltal4 + heltal5)/5);
		
		
		System.out.println("Högst: " + intStorstatal1 + "\nLägst: "
				+ intMinstatal1 + "\nMedel: " + medelvarde1);
			
		}

	}

