
import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int turns = 0;
		String oddEven;
		
		turns = input.nextInt();
		
		for (int i = 0; i < turns; i++) {
			x = input.nextInt();
			
			if (x % 2 == 0) {
				oddEven = "even";
			}
			else {
				oddEven = "odd";
			}
			System.out.println(x + " is " + oddEven);
		}
		
		
		
	}
}
