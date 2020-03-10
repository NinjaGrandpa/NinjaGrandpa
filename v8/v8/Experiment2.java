package v8;

import java.util.Scanner;

public class Experiment2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		boolean start = false;
		char[] charArr;

		

		while (!start) {
			
			String textInput = input.nextLine();
			charArr = textInput.toCharArray();
			
			if (charArr.length <= 3) {
				start = true;
				for (int i = 0; i < charArr.length; i++) {
					if (Character.isDigit(charArr[i])) {
						System.out.println("It is a digit");
					}
					
					else if (!Character.isDigit(charArr[i])) {
						System.out.println("Not a digit");
						break;
					}
				}
			}

			else {
				start = false;
				System.out.println("Type an integer");
			}
		}

	}
}
