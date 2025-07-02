package DAY2_ControlFlow;
import java.util.Scanner;

public class rocketLaunch {

	public static void main(String[] args) {
		System.out.println("enter counter value ");
		Scanner input=new Scanner(System.in);
		int counter = input.nextInt();
		System.out.println("the rocket launch will start in ");
		while(counter!=0) {
			
			System.out.println(" " + counter);
			counter--;
		}
		input.close();
		
	}
	
}
