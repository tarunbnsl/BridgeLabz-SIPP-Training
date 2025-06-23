package Day1_ProgrammingElements;
import java.util.Scanner;
public class Q12 {
		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input base and height in inches
	        System.out.print("Enter the base of the triangle in inches: ");
	        double base = scanner.nextDouble();

	        System.out.print("Enter the height of the triangle in inches: ");
	        double height = scanner.nextDouble();

	        // Calculate area in square inches
	        double areaInches = 0.5 * base * height;

	        // Convert area to square centimeters
	        double areaCm = areaInches * 6.4516;

	        // Output the result
	        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.%n",
	                          areaInches, areaCm);

	        scanner.close();
	    }
	}


