package Day5_String;

import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstring(String input, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < input.length(); i++) {
            result += input.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.next();

        System.out.println("Enter start index:");
        int start = scanner.nextInt();

        System.out.println("Enter end index:");
        int end = scanner.nextInt();

        String manualSubstring = createSubstring(text, start, end);

        String builtInSubstring = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtInSubstring = text.substring(start, end);
        }

        boolean isEqual = compareStrings(manualSubstring, builtInSubstring);

        System.out.println("\nOriginal text:         " + text);
        System.out.println("Manual substring:      " + manualSubstring);
        System.out.println("Built-in substring:    " + builtInSubstring);
        System.out.println("Are substrings equal?  " + isEqual);
    
}}
