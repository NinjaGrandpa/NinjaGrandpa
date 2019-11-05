package v39;

import java.util.Scanner;

public class uppgift9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int fact = number;
		
		for(int i = (number - 1); i > 1; i --) {
			fact = fact * i;
		}
		
		
	}
}
