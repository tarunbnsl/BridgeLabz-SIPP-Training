package Day5_String;

import java.util.Scanner;

public class StringIndexExceptionDemo {

    public static void generateException(String input) {
        System.out.println("Generating exception (unhandled):");
        System.out.println("Character at index " + input.length() + " is: " + input.charAt(input.length()));
    }

    public static void handleException(String input) {
        System.out.println("Handling exception with try-catch:");
        try {
            char ch = input.charAt(input.length());
            System.out.println("Character at index " + input.length() + " is: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        try {
            generateException(userInput); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e);
        }

        System.out.println();

        handleException(userInput);
    }
}

