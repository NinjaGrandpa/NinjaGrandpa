package v41;

import java.util.Scanner;
import java.lang.Math;

public class uppgift6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double pi = Math.PI;
		double volume = 0;
		long roundVolume = 0;
		
		System.out.println("Skriv in radie och höjd på cylindern i cm.");
		double radius = input.nextDouble();
		double height = input.nextDouble();
		
		double base = Math.pow(radius, 2) * pi;
		volume = base * height;
		roundVolume = Math.round(volume);
		
		System.out.println("Volymen på cylindern är " + volume + " ml\n" + 
		"(" + roundVolume + " ml)");
		
	}
}
