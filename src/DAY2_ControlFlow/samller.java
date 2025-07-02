package DAY2_ControlFlow;
import java.util.Scanner;
public class samller {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter any three no ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int m=a;
		if(m>b || m>c)
			m=b;
		if(m>c)
			m=c;
		
		System.out.println("smaller is "+ m);
		
	}
}
