package Day4_Methods;
import java.util.Scanner;
public class WindChillCalculator {
	public double calculateWindChill(double temperature, double windSpeed) {
       
            return 35.74 + 0.6215 * temperature 
                   - 35.75 * Math.pow(windSpeed, 0.16) 
                   + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	
        System.out.print("Enter the temperature in Fahrenheit (≤ 50): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in mph (≥ 3): ");
        double windSpeed = scanner.nextDouble();
        WindChillCalculator calculator = new WindChillCalculator();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
          scanner.close();
	}
	
}
