package v39;
import java.util.Scanner;

public class Lektion0923 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Anv�nds n�r man inte vet hur m�nga g�nger man vill repetera n�got
		
		boolean exit = false;
		
		while(!exit){
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
		
	}
}
