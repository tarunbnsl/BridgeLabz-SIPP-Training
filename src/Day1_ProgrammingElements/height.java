package Day1_ProgrammingElements;
import java.util.Scanner;

public class height {

	    public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter height in cm
	        System.out.print("Enter your height in centimeters: ");
	        double heightCm = scanner.nextDouble();

	        // Convert cm to total inches (1 inch = 2.54 cm
	        double totalInches = heightCm / 2.54;

	        // Convert total inches to feet and remaining inches
	        int feet = (int)(totalInches / 12);
	        double inches = totalInches % 12;

	        // Print the result
	        System.out.printf("Your Height in cm is %.2f, while in feet is %d and inches is %.2f%n",
	                          heightCm, feet, inches);
	        
	        // Close scanner
	        scanner.close();
	    }

}