package Day1_ProgrammingElements;
import java.util.Scanner;

public class discount2 {
     public static void main(String[]args) {
    	 Scanner input = new Scanner(System.in);
    	 double fee = input.nextInt();
    	 double dscntprcnt = input.nextDouble();
    	 double dscnt = (fee*dscntprcnt)/100;
    			 double totalfee = fee - dscnt;
    			 System.out.println("The discount amount is INR " + dscnt );
    			 System.out.println("and final discounted fee is INR " 
			 		+ totalfee);
    			 input.close();

}
}
