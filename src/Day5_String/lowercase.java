package Day5_String;
import java.util.Scanner;
public class lowercase {

	    public static String convertToLowerCase(String input) {
	        String result = "";
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') {
	                ch = (char)(ch + 32); // Convert to lowercase
	            }
	            result += ch;
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

	        System.out.println("Enter your text:");
	        String originalText = scanner.nextLine();

	        String builtInLower = originalText.toLowerCase();
	        String manualLower = convertToLowerCase(originalText);

	        boolean isEqual = compareStrings(builtInLower, manualLower);

	        System.out.println("\nOriginal Text:      " + originalText);
	        System.out.println("Built-in Lowercase: " + builtInLower);
	        System.out.println("Manual Lowercase:   " + manualLower);
	        System.out.println("Are both equal?     " + isEqual);
	    }
	}


