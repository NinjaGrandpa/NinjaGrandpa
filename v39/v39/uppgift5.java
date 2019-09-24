package v39;
import java.util.Scanner;

public class uppgift5 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		int exit1 = 1;
		int sum1 = 0;
		System.out.println("Skriv in en rad heltal och när du skriver 0 så skrivs summan ut");
				do {
					int line1 = input1.nextInt();
					
					if (line1 != 0) {
						sum1 = line1 + sum1;
					}
					
					else if (line1 == 0) {
						exit1 = 0;
					}
					
				
					
				}
				while(exit1 != 0);
				System.out.println("Summa:\n" + sum1);
		
	}
}
