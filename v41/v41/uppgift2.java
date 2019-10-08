package v41;

import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long part = 0;
		long sum = 0;
		long integer = input.nextInt();
		
			
		while (integer != 0) {
			part = integer % 10;
			sum += part;
			integer = integer/10;
		}
		
		System.out.println(sum);
		
	}
}
