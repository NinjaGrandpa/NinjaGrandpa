import java.util.Scanner;  // Importerar Scanner

public class lektion0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input1 = new Scanner(System.in); // Scanner - väntar på användaresn input
		
		
		
		System.out.println("Skriv en lista med namn:");
		
		String namn1 = input1.nextLine();
		String namn2 = input1.nextLine();
		String namn3 = input1.nextLine();
		String namn4 = input1.nextLine(); // Läser in input1 från Console och lägger det i namn4
		
		System.out.println("\nNAMN:\n" + namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4);
	}

}
