package Day4_Methods;
import java.util.Scanner;
public class prime {
     public static void main(String[] args) {
    	 Scanner j = new Scanner(System.in);
    	 System.out.println("enter a anumber ");
    	 int n = j.nextInt();
    	 int count=0;
    	 for(int i=2;i<n;i++) {
    		 if(n%i==0) {
    			 count++;
    		 }
    	 }
    	 if(count>0) {
    		 System.out.println("it is not prime");
    	 }
    	 else
    	 System.out.println("it is prime");
     }
	
}
