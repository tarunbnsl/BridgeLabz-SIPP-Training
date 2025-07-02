package DAY2_ControlFlow;
import java.util.Scanner;
public class power {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int p=input.nextInt();
		int t=1;
		int c=p;
		while(c!=0) {
			t=t*n;
			c--;
		}
		System.out.println(" " + t);
		
	}
}
