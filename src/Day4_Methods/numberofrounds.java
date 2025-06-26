package Day4_Methods;
import java.util.Scanner;
public class numberofrounds {
 
	public static double rounds(int f,int s,int t) {
		
		double p=f+s+t;
		p=p/1000;
		double q=5/p;
		return q;
	}
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		
		System.out.println("enter sides of triangle ");
		int f=i.nextInt();
		int s=i.nextInt();
		int t=i.nextInt();
		
		double r = rounds(f,s,t);
		System.out.println("nomber of rounds are " + r);
		i.close();
	}
}
