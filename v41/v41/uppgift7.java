package v41;

import java.util.Scanner;

public class uppgift7 {

	public static void main(String[] args) {
		
		System.out.println("Hur lång ska sidan vara?");
		
		Scanner input = new Scanner(System.in);
		
		int side = input.nextInt();
		int turns = 0;
		String dollar = "$";
		
		while (turns < side) {
			turns++;
			System.out.println(dollar);
		}
		
	}
}
