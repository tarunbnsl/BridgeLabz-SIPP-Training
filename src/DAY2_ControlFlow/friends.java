package DAY2_ControlFlow;
import java.util.Scanner;
public class friends {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter age of Amar: ");
	        int ageAmar = scanner.nextInt();
	        System.out.print("Enter height of Amar (in cm): ");
	        int heightAmar = scanner.nextInt();

	        System.out.print("Enter age of Akbar: ");
	        int ageAkbar = scanner.nextInt();
	        System.out.print("Enter height of Akbar (in cm): ");
	        int heightAkbar = scanner.nextInt();

	        System.out.print("Enter age of Anthony: ");
	        int ageAnthony = scanner.nextInt();
	        System.out.print("Enter height of Anthony (in cm): ");
	        int heightAnthony = scanner.nextInt();

	        String youngest;
	        int minAge = ageAmar;
	        youngest = "Amar";

	        if (ageAkbar < minAge) {
	            minAge = ageAkbar;
	            youngest = "Akbar";
	        }
	        if (ageAnthony < minAge) {
	            minAge = ageAnthony;
	            youngest = "Anthony";
	        }

	        String tallest;
	        int maxHeight = heightAmar;
	        tallest = "Amar";

	        if (heightAkbar > maxHeight) {
	            maxHeight = heightAkbar;
	            tallest = "Akbar";
	        }
	        if (heightAnthony > maxHeight) {
	            maxHeight = heightAnthony;
	            tallest = "Anthony";
	        }

	        System.out.println("The youngest friend is: " + youngest);
	        System.out.println("The tallest friend is: " + tallest);
	    }
	}


