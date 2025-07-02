package Day5_String;
import java.util.Scanner;
public class numberFormatException {
	 public static void generateException(String text) {
	        int number = Integer.parseInt(text);
	        System.out.println("Parsed number is: " + number);
	    }

	    public static void handleException(String text) {
	        try {
	            int number = Integer.parseInt(text);
	            System.out.println("Parsed number is: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Caught NumberFormatException: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("Caught RuntimeException: " + e.getMessage());
	        }
	    }

	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking user input
	        System.out.print("Enter a number (or text to cause NumberFormatException): ");
	        String userInput = scanner.nextLine();

	        handleException(userInput);

	        scanner.close();
	    }
	
}
