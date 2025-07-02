package DAY2_ControlFlow;
import java.util.Scanner;
public class voting {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		
		if(a>17)
			System.out.println("the person can vote ");
		else
		    System.out.println("person can't vote ");
		
	}
}
