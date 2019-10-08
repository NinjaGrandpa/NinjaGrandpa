package v41;

import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int integer1;
		int integer2;
		int intLow;
		
		integer1 = input.nextInt();
		integer2 = input.nextInt();
		
		if (integer1 < integer2) {
			intLow = integer1;
		}
		else {
			intLow = integer2;
		}
		
		System.out.println(intLow);
	}
}
