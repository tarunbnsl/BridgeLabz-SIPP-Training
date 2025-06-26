package Day4_Methods;
import java.util.Scanner;
public class findRemainderAndQuotient {

	public static int[] RemainderAndQuotient(int number, int divisor) {
		
		int q=number/divisor;
		int r=number%divisor;
		return new int[] {q,r};
	}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number (dividend): ");
	        int number = scanner.nextInt();

	        System.out.print("Enter the divisor: ");
	        int divisor = scanner.nextInt();

	        if (divisor == 0) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } else {
	            int[] result = RemainderAndQuotient(number, divisor);
	            System.out.println("Quotient: " + result[0]);
	            System.out.println("Remainder: " + result[1]);}
		
		
	}
}
