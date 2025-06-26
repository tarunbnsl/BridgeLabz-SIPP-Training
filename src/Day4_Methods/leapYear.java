package Day4_Methods;
import java.util.Scanner;

public class leapYear {
	
	public static boolean year(int n) {
		if((n%4==0 && n%100!=0) || n%400==0) {
			return true;
		}else 
			return false;
		
	}
       public static void main(String[] args) {
    	   Scanner i=new Scanner(System.in);
    	   
    	   System.out.println("enter a year greater than 1582 ");
    	   int a=i.nextInt();
    	   boolean b=year(a);
    	   System.out.println("the year is leap year " + b);
    	   i.close();
    	   
    	   
       }
}