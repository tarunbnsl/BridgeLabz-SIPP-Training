 package Day3_Arrays;
import java.util.Scanner;
public class Q6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of persons: ");
	        int number = scanner.nextInt();

	        double[][] personData = new double[number][3]; // 0: height, 1: weight, 2: BMI
	        String[] weightStatus = new String[number];

	        for (int i = 0; i < number; i++) {
	            double height, weight;

	            do {
	                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
	                height = scanner.nextDouble();
	                if (height <= 0) {
	                    System.out.println("Height must be a positive value.");
	                }
	            } while (height <= 0);

	            do {
	                System.out.print("Enter weight (in kilograms) for person " + (i + 1) + ": ");
	                weight = scanner.nextDouble();
	                if (weight <= 0) {
	                    System.out.println("Weight must be a positive value.");
	                }
	            } while (weight <= 0);

	            personData[i][0] = height;
	            personData[i][1] = weight;

	            double bmi = weight / (height * height);
	            personData[i][2] = bmi;

	            if (bmi < 18.5) {
	                weightStatus[i] = "Underweight";
	            } else if (bmi < 25) {
	                weightStatus[i] = "Normal weight";
	            } else if (bmi < 30) {
	                weightStatus[i] = "Overweight";
	            } else {
	                weightStatus[i] = "Obese";
	            }
	        }

	        System.out.println("\n--- BMI Report ---");
	        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
	        for (int i = 0; i < number; i++) {
	            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
	                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
	        }

	        scanner.close();
	    }
	}


