package v45;

import java.util.Scanner;

public class Stairs {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int stairs = input.nextInt();
		
		for (int i = 1; i <= stairs; i++) {
			
			for (int j=1; j <= stairs-1; j++) {
				System.out.print(" ");
			}

			for (int k=1; k<=i;k++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		
	}
}
