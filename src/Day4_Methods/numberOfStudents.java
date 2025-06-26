package Day4_Methods;
import java.util.Scanner;

public class numberOfStudents {

	public static int combinations(int n ) {
		int a=(n*(n-1))/2;
		return a;
	}
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		System.out.println("enter no of students ");
		int b=i.nextInt()
;
		int c=combinations(b);
		System.out.println("posible handshakes are " + c);
		i.close();
	}
	
}
