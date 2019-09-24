package v39;

import java.util.Scanner;

public class uppgift6 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		boolean exit1 = false;
		
		do {
			String line1 = input1.nextLine();
			if(line1.equals("exit")) {
				exit1 = true;
			}
			else {
				String text1 = line1;
			}
		}
		while (!exit1);
	}
}
