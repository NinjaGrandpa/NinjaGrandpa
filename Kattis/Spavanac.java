
import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int hours = input.nextInt();
		int minutes = input.nextInt();
		int addMinutes = 0;
		int addHours = 0;
		
		addMinutes = minutes - 45;
		
		if (addMinutes < 0) {
			minutes = 60 + addMinutes;
			
			addHours = hours - 1;
			if (addHours < 0) {
				hours = 23;
			}
			else {
				hours--;
			}
		}
		else {
			minutes = addMinutes;
		}
		
		System.out.println(hours + " " + minutes);
		
		}
		
	}
