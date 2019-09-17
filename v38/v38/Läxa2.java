package v38;

import java.util.Scanner;

public class Läxa2 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		int storstatal1 = 0;
		int minstatal1 = 0;
		
		System.out.println("Skriv in 5 heltal: ");
		int heltal1 = input1.nextInt();
		int heltal2 = input1.nextInt();
		int heltal3 = input1.nextInt();
		int heltal4 = input1.nextInt();
		int heltal5 = input1.nextInt();
		
		if (heltal1 > heltal2 && heltal1 > heltal3 && 
			heltal1 > heltal4 && heltal1 > heltal5) {
			storstatal1 = heltal1;	
		}
		if (heltal1 < heltal2 && heltal1 < heltal3 &&
			heltal1 < heltal4 && heltal1 < heltal5) {
			minstatal1 = heltal1;
		}
		if (heltal2 > heltal1 && heltal2 > heltal3 && 
			heltal2 > heltal4 && heltal2 > heltal5) {
			storstatal1 = heltal2;
		}
		if (heltal2 < heltal1 && heltal2 < heltal3 &&
			heltal2 < heltal4 && heltal2 < heltal5) {
			minstatal1 = heltal2;
		}
		if (heltal3 > heltal1 && heltal3 > heltal2 && 
			heltal3 > heltal4 && heltal3 > heltal5) {
			storstatal1 = heltal3;	
		}
		if (heltal3 < heltal1 && heltal3 < heltal2 && 
			heltal3 < heltal4 && heltal3 < heltal5) {
			minstatal1 = heltal3;	
		}
		if (heltal4 > heltal1 && heltal4 > heltal2 && 
			heltal4 > heltal3 && heltal4 > heltal5) {
			storstatal1 = heltal4;	
		}
		if (heltal4 < heltal1 && heltal4 < heltal2 && 
			heltal4 < heltal3 && heltal4 < heltal5) {
			minstatal1 = heltal4;	
		}
		if (heltal5 > heltal1 && heltal5 > heltal2 && 
			heltal5 > heltal3 && heltal5 > heltal4) {
			storstatal1 = heltal5;	
		}
		if (heltal5 < heltal1 && heltal5 < heltal2 && 
			heltal5 < heltal3 && heltal5 < heltal4) {
			minstatal1 = heltal5;	
		}

	}
}
