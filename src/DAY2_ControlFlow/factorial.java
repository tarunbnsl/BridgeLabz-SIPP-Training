package DAY2_ControlFlow;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m=1;
		int n=input.nextInt()
; 
		while(n!=0){
			m=m*n;
			n--;
		}
		System.out.println("factorial of given number is "+ m);
	}
	
}
