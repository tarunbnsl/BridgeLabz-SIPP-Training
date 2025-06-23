package Day1_ProgrammingElements;
import java.util.Scanner;

public class Q11 {
	
 public static void main(String[] args) {
	        // Create Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter the first number: ");
	        double number1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double number2 = scanner.nextDouble();

	        // Perform arithmetic operations
	        double addition = number1 + number2;
	        double subtraction = number1 - number2;
	        double multiplication = number1 * number2;
	        double division = (number2 != 0) ? number1 / number2 : Double.NaN; // Handle division by zero

	        // Output the results
	        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is:\n", number1, number2);
	        System.out.printf("Addition: %.2f\n", addition);
	        System.out.printf("Subtraction: %.2f\n", subtraction);
	        System.out.printf("Multiplication: %.2f\n", multiplication);
	        System.out.printf("Division: %.2f\n", division);

	        // Close the scanner
	        scanner.close();
	    
	}

}
