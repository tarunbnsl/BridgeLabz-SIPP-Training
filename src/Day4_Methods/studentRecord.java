package Day4_Methods;
import java.util.Scanner;
public class studentRecord {

	public static void main(String[] args) {
		Scanner j=new Scanner(System.in);
		System.out.println("enter no of stidents ");
		int n=j.nextInt();
		System.out.println("enter the marks of students ");
		int[] arr =new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=j.nextInt();
		}
		int total=0;
		for(int i =0;i<arr.length;i++) {
			total=total+arr[i];
		}
		double average=total/n;
		int smallest=arr[0];
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		System.out.println("the average is "+ average);
		System.out.println("the smallest is "+ smallest);
		System.out.println("the largest is "+ largest);
		System.out.println("the marks above aveage are ");
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>average) {
				System.out.println("" + arr[i]);			}
		}
	}
}
