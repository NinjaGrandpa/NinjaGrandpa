
import java.util.Scanner;

public class timeLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int magicN = 0;
		
		magicN = input.nextInt();
		
		for (int i = 1; i < (magicN + 1); i ++) {
			System.out.println(i + " Abracadabra");
		}
		
	}
}
