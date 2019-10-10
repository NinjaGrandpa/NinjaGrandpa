package v41;

import java.util.Scanner;

public class uppgift4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 1;
		int integer = 0;
		int turns = 0;
		
		while (sum < 100000 && turns < 10) {
			turns ++;
			integer = input.nextInt();
			sum = integer * sum;
		}
		System.out.println(sum);
		
		
	}
}
