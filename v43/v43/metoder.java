package v43;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in två heltal:");
		
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();
		
		System.out.println(ifInteger(integer1, integer2));;
		
	}

	
/**
 * Jämför två olika heltal och bestämmer vilket som är störst och vilket som är minst. 
 * Samt skickar tillbaka en hälsning.
 * @param integer1
 * @param integer2
 * @return
 */
	static String ifInteger(int integer1, int integer2) {
		
		if(integer1 > integer2) {
			System.out.println("Minsta talet är " + integer2);
			System.out.println("Största talet är " + integer1);
		}
		else {
			System.out.println("Minsta talet är " + integer1);
			System.out.println("Största talet är " + integer2);
		}
		
		String hello = "Metoden är klar";
		
		return hello;
	}
}
