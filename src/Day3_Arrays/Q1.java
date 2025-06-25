package Day3_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Q1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        int[] multiplicationResult = new int[4]; // for 6 to 9

	        for (int i = 0; i < 4; i++) {
	            int multiplier = 6 + i;
	            multiplicationResult[i] = number * multiplier;
	        }

	        for (int i = 0; i < 4; i++) {
	            int multiplier = 6 + i;
	            multiplicationResult[i] = number * multiplier;
	        }

	        System.out.println("Multiplication results stored in array: " + Arrays.toString(multiplicationResult));

	        scanner.close();
	    }
	}



