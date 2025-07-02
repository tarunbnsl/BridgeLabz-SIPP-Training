package Day4_Methods;
import java.util.Scanner;
public class largest {
	
	public static int largest(int[] arr){
	 int largest=arr[0];
	    for(int i = 1;i<arr.length;i++){
	        if(arr[i]>largest){
	            largest=arr[i];
	        }
	    }
	return largest;
	}
	public static void main(String[] args){
	 Scanner i= new Scanner(System.in);
	 
	  System.out.println("enter no of elements in array ");
	  int n=i.nextInt();
      int[] arr=new int[n];
      System.out.println("enter elements ");
	  for(int j=0;j<n;j++){
	    arr[j] = i.nextInt();
	  }
	  int b=largest(arr);
	  System.out.println("largest is " + b);
	  i.close();
	}
}

