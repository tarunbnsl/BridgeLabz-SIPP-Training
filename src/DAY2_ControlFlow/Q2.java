package DAY2_ControlFlow;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		double total=0.0;
		System.out.println("if enter 0 then it will stop ");
		double number;
		Scanner input=new Scanner(System.in);
		number = input.nextDouble();
		
		while(number!=0) {
			total = total+number;
			System.out.println("enter another no ");
			number=input.nextDouble();
		}
		System.out.println("total sum : " + total);
	}
	
}
