package Day1_ProgrammingElements;

import java.util.Scanner;

public class distence {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input distance in feet
	        System.out.print("Enter the distance in feet: ");
	        double distanceInFeet = scanner.nextDouble();

	        // Convert to yards
	        double distanceInYards = distanceInFeet / 3;

	        // Convert to miles
	        double distanceInMiles = distanceInYards / 1760;

	        // Output the results
	        System.out.printf("Your distance in feet is %.2f, in yards is %.2f, and in miles is %.6f%n",
	                          distanceInFeet, distanceInYards, distanceInMiles);

	        scanner.close();
	    }
}
