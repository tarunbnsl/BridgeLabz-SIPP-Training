package Day1_ProgrammingElements;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side
        double side = perimeter / 4;

        // Print the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);

        scanner.close();
    }

}
