package DAY2_ControlFlow;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int m=input.nextInt();
	int d=input.nextInt();
	
	if((m==3 && d>=20 && d<=31) || 
		(m==4 || m==5) ||
		(m==6 && d<=20)) {
		System.out.println("this is spring season");
	}
	else
	System.out.println("this is not spring season");
		
		
   }
}