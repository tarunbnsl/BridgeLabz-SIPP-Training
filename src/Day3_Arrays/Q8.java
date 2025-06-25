package Day3_Arrays;
import java.util.Scanner;
public class Q8 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        final int maxDigit = 10;
	        int[] digits = new int[maxDigit];

	        int index = 0;

	        while (number != 0) {
	            int digit = number % 10;       // get last digit
	            digits[index] = digit;         // store in array
	            index++;

	            if (index == maxDigit) {
	                break; // limit reached
	            }

	            number = number / 10; // remove last digit
	        }

	        int largest = -1;
	        int secondLargest = -1;

	        for (int i = 0; i < index; i++) {
	            int current = digits[i];
	            if (current > largest) {
	                secondLargest = largest;
	                largest = current;
	            } else if (current > secondLargest && current != largest) {
	                secondLargest = current;
	            }
	        }

            System.out.println("\n--- Result ---");
	        System.out.println("Digits entered: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(digits[i] + " ");
	        }
	        System.out.println("\nLargest digit: " + largest);
	        if (secondLargest != -1) {
	            System.out.println("Second largest digit: " + secondLargest);
	        } else {
	            System.out.println("Second largest digit: Not available (all digits may be same)");
	        }

	        scanner.close();
	    }
	}


