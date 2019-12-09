package v48;

public class arraylektion2 {

	public static void main(String[] args) {
		
		double[] numbers = new double[20];
		double[] numbers2 = {12,34,45,};
		
		String[] namn = {"Gabriel","Ida","Petter","Malte","Kalle","Emil"};
		
		int antalA = 0;
		
		for (int i = 0; i < namn.length; i++) {
			
			
			for (int j = 0 ; j < namn[j].length(); j++) {
				if (namn[j].contains("a")) {
					
					antalA++;
				}
			}
			
			
		}
		
		System.out.println("Antalet A:n är " + antalA);
	}
}
