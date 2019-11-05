package v39;
import java.util.Scanner;

public class läxaEnchanced {

	Scanner input;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tal1 = input.nextInt();
		
		int highest = tal1;
		int lowest = tal1;
		int sum = tal1;
		
		int tal2 = input.nextInt();
		
		sum += tal2;
		
		if(tal2 > highest) {
			highest = tal2;
		}
		else if(tal2 < lowest) {
			lowest = tal2;
		}
	}
}
