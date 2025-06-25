package Day3_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Q4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter 11 players height ");
		double[] heights = new double[11];
		for(int i=0;i<11;i++) {
			heights[i] = input.nextDouble();		}
		
	double t=0;
	
	for(int j=0;j<11;j++) {
		t=t+heights[j];
	}
	System.out.println("avearge of football team is "+ t/11);
  }
}
