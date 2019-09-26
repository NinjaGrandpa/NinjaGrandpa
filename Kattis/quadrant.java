
import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int quadrant = 0;
		
		x = input.nextInt();
		y = input.nextInt();
		
		if(x > 0 && y > 0) {
			quadrant = 1;
		}
		else if(x < 0 && y > 0) {
			quadrant = 2;
		}
		else if(x < 0 && y < 0) {
			quadrant = 3;
		}
		else if(x > 0 && y < 0) {
			quadrant = 4;
		}
		System.out.println(quadrant);
	}
	
}
