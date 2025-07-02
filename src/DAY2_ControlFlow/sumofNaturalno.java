package DAY2_ControlFlow;
import java.util.Scanner;
public class sumofNaturalno {
public static void main(String[] args) {
      
	Scanner a=new Scanner(System.in);
	System.out.println("enter a natural no ");
	int n = a.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum = sum+i;
	}
	System.out.println("sum " + sum);
	int sum2=(n*(n+1))/2;
	System.out.println("sum2 " + sum2);
a.close();
}

}
