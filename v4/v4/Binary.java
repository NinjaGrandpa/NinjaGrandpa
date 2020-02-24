package v4;

import java.util.Scanner;
import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int binary[] = new int[40];
		
		
		
		int index = 0;
		while(number > 0) {
			binary[index++] = number%2;
			number = number/2;
		}
		
		
		for (int i = 0; i < binary.length/2; i++) {
			int temp = binary[i];
			binary[i] = binary[binary.length -i -1];
			binary[binary.length -i -1] = temp;
		}
		
		for (int j = index - 1; j >= 0; j--) {
			System.out.print(binary[j]);
		}
		
	}
}
