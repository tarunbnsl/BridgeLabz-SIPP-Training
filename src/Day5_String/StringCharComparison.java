package Day5_String;

import java.util.Scanner;

public class StringCharComparison {

    public static char[] getCharacters(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word (no spaces):");
        String input = scanner.next();  // using next() as per instruction

        char[] userDefinedArray = getCharacters(input);

        char[] builtInArray = input.toCharArray();

        boolean isEqual = compareCharArrays(userDefinedArray, builtInArray);

        System.out.println("\nUser-defined char array:");
        printCharArray(userDefinedArray);

        System.out.println("Built-in char array:");
        printCharArray(builtInArray);

        System.out.println("\nAre both arrays equal? " + isEqual);
    }
}

