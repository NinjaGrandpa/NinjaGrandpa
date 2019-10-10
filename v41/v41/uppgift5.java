package v41;

public class uppgift5 {

	public static void main(String[] args) {
		
		int currentNumber = 0;
		
		while (currentNumber < 10000) {
			currentNumber++;
			if (currentNumber % 7 == 0) {
				System.out.println(currentNumber);
			}
		}
		
	}
	
}
