package methodLibrary;

import java.util.Scanner;

public class MethodLibrary {

/**
 * Omvandlar F till K
 * @param fahrenheit
 * @return
 */
	
	static double fahrenheitToKelvin(double fahrenheit) {
		
		double kelvin = (fahrenheit + 459.67) * 5/9;
		
		return kelvin;
	}
	
	/**
	 * Omvandlar C till K
	 * @param kelvin
	 * @return
	 */
	
	static double kelvinToCelsius(double kelvin) {
		
		double celsius = (kelvin - 273.15);
		
		return celsius;
	}
	
	/**
	 * Omvandlar km/h till m/s
	 * @param velocityKmH
	 * @return
	 */
	
	static double velocityConversion(double velocityKmH) {
		
		double velocityMS = (velocityKmH/3.6);
		
		return velocityMS;
		
	}
	
	/**
	 * Gör om massa och hastighet till kraft
	 * @param mass
	 * @param velocity
	 * @return
	 */
	
	static double kineticEnergy(double mass, double velocity) {
		
		double force = mass * velocity;
		
		return force;
	}
	
	
	/**
	 * Gör om massa, höjd och tyngdkraft till potentiell energi
	 * @param mass
	 * @param height
	 * @return
	 */
	
	static double potentialEnergy(double mass, double height) {
		
		double gravity = 9.82;
		double force = mass*height*gravity;
		
		return force;
	}
	
	/**
	 * Plockar ut medelvärdet ifrån tre tal
	 * @param first
	 * @param second
	 * @param last
	 * @return
	 */
	
	static double delta(double first, double second, double last) {
		
		double deltaOutput = (first+second+last)/3;
		
		return deltaOutput;
	}
	
	/**
	 * Gör om strängar med stora bokstäver till små bokstäver
	 * @param word
	 * @return
	 */
	
	static String smallLetters(String word) {
		
		word = word.toLowerCase();
		
		return word;
	}
	
	/**
	 * Gör om "o" till "0" och små bokstäver till stora
	 * @param word
	 * @return
	 */
	
	static String pr0grammering(String word) {
		
		return word.replace("o", "0").toUpperCase();
	}
	
	/**
	 * Följer ekvationen för hasighet
	 * @param distance
	 * @param velocity
	 * @return
	 */
	
	static double svtTime(double distance, double velocity) {
		
		double time = distance/velocity;
		
		return time;
	}
	
	
	/**
	 * Följer ekvationen för arbete
	 * @param force
	 * @param distance
	 * @return
	 */
	
	static double work(double force, double distance) {
		
		double work = force*distance;
		
		return work;
	}
	
	/**
	 * Gör om hastighet till höjd via energiprincipen
	 * @param velocity
	 * @return
	 */
	
	static double velocityToHeight(double velocity) {
		
		double height = Math.pow(velocity, 2)/19.64;
		
		return height;
	}
	
	static double sphereVolumeToRadius(double Volume) {
		
		double radius = Math.pow((3*Volume*Math.PI)/3, 1/3);
		
		return radius;
	}
	
	/**
	 * Ekvationen för kraft
	 * @param acceleration
	 * @param mass
	 * @return
	 */
	
	static double forceEquation(double acceleration, double mass) {
		
		double force = acceleration*mass*9.82;
		
		return force;
	}
	
	/**
	 * Konverterar valutan SEK till EURO
	 * @param sek
	 * @return
	 */
	
	static double sekToEuro(double sek) {
		
		double euro = sek*0.094;
		return euro;
	}
	
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Fahrenheit");
		double fahrenheit = input.nextDouble();
		System.out.println(fahrenheitToKelvin(fahrenheit));
		
		System.out.println("Kelvin");
		double kelvin = input.nextDouble();
		System.out.println(kelvinToCelsius(kelvin));
		
		System.out.println("Km/H");
		double velocityKmH = input.nextDouble();
		System.out.println(velocityConversion(velocityKmH));
		
		System.out.println("Mass, Velocity");
		double mass = input.nextDouble();
		double velocity = input.nextDouble();
		System.out.println(kineticEnergy(mass, velocity));
		
		System.out.println("Mass, Height");
		double mass2 = input.nextDouble();
		double height = input.nextDouble();
		System.out.println(potentialEnergy(mass2, height));
		
		System.out.println("Integer, Integer, Integer");
		double first = input.nextDouble();
		double second = input.nextDouble();
		double last = input.nextDouble();
		System.out.println(delta(first, second, last));
		
		System.out.println("Word");
		input.nextLine();
		String word = input.nextLine();
		System.out.println(smallLetters(word));
		
		System.out.println("Word");
		String word2 = input.nextLine();
		System.out.println(pr0grammering(word2));
		
		System.out.println("Distance, Velocity");
		double distance = input.nextDouble();
		double velocity2 = input.nextDouble();
		System.out.println(svtTime(distance, velocity2));
		
		System.out.println("Force, Distance");
		double force2 = input.nextDouble();
		double distance2 = input.nextDouble();
		System.out.println(work(force2, distance2));
		
		System.out.println("Velocity");
		double velocity3 = input.nextDouble();
		System.out.println(velocityToHeight(velocity3));
		
		System.out.println("Volume");
		double Volume = input.nextDouble();
		System.out.println(sphereVolumeToRadius(Volume));
		
		System.out.println("Acceleration, Mass");
		double acceleration = input.nextDouble();
		double mass1 = input.nextDouble();
		System.out.println(forceEquation(acceleration, mass1));
		
		System.out.println("SEK");
		double sek = input.nextDouble();
		System.out.println(sekToEuro(sek));
	}
	
	
	
}
