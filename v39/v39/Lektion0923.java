package v39;
import java.util.Scanner;

public class Lektion0923 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Används när man inte vet hur många gånger man vill repetera något
		
		boolean exit = false;
		
		while(!exit){
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
		
	}
}
