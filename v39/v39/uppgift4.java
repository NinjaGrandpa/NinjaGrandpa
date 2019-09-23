package v39;
import java.util.Scanner;

public class uppgift4 {

	public static void main(String[] args) {
		
		System.out.println("Skriv in ett heltal under 10:");
		
		Scanner input1 = new Scanner(System.in);
		int heltal1;
		heltal1=input1.nextInt();
		for (int i = 1; i < 11; i++) {
			int multiTal1= i * heltal1;
			System.out.println(multiTal1);
		}
		
	}
}
