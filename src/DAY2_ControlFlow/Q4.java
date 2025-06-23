package DAY2_ControlFlow;
import java.util.Scanner;
public class Q4 {

	 {
		
		System.out.println("enter a number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n%5==0) {
			System.out.println(" Is the number " + n); 
			System.out.println("divisible by 5? yes");
		     }
		else {
		System.out.println("Is the number " + n);
		System.out.println("divisible by 5? NO");
		}
		
	}
}
