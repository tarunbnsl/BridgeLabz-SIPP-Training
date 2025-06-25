package Day3_Arrays;
import java.util.Scanner;
public class Q5 {

	    public static void main(String[] args) {
	        final int EMPLOYEE_COUNT = 10;
	        double[][] employeeData = new double[EMPLOYEE_COUNT][2]; // [][0] = salary, [][1] = years of service
	        double[] bonus = new double[EMPLOYEE_COUNT];
	        double[] newSalary = new double[EMPLOYEE_COUNT];

	        double totalBonus = 0.0;
	        double totalOldSalary = 0.0;
	        double totalNewSalary = 0.0;

	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
	            double salary = -1;
	            double years = -1;

	            while (salary <= 0) {
	                System.out.print("Enter salary for employee " + (i + 1) + ": ");
	                if (scanner.hasNextDouble()) {
	                    salary = scanner.nextDouble();
	                    if (salary <= 0) {
	                        System.out.println("Invalid salary. Please enter a positive number.");
	                    }
	                } else {
	                    System.out.println("Invalid input. Please enter a numeric value.");
	                    scanner.next(); // clear invalid input
	                }
	            }

	            while (years < 0) {
	                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
	                if (scanner.hasNextDouble()) {
	                    years = scanner.nextDouble();
	                    if (years < 0) {
	                        System.out.println("Invalid years. Please enter a non-negative number.");
	                    }
	                } else {
	                    System.out.println("Invalid input. Please enter a numeric value.");
	                    scanner.next(); // clear invalid input
	                }
	            }

	            employeeData[i][0] = salary;
	            employeeData[i][1] = years;
	        }

	        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
	            double salary = employeeData[i][0];
	            double years = employeeData[i][1];
	            double empBonus;

	            if (years > 5) {
	                empBonus = salary * 0.05;
	            } else {
	                empBonus = salary * 0.02;
	            }

	            bonus[i] = empBonus;
	            newSalary[i] = salary + empBonus;

	            totalBonus += empBonus;
	            totalOldSalary += salary;
	            totalNewSalary += newSalary[i];
	        }

	        System.out.println("\n--- Bonus and Salary Report ---");
	        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
	            System.out.printf("Employee %d - Old Salary: %.2f, Years of Service: %.1f, Bonus: %.2f, New Salary: %.2f%n",
	                    (i + 1), employeeData[i][0], employeeData[i][1], bonus[i], newSalary[i]);
	        }

	        System.out.println("\n--- Totals ---");
	        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
	        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
	        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
    }
}
