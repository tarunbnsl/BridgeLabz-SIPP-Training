package Day4_Methods;

public class smallest {
	
 public static void main(String[] args) {
	 
	 int[] arr= {4,3,5,2,6,0};
	 int smallest=arr[0];
	 for(int i=1;i<arr.length;i++) {
		 if(smallest>arr[i]) {
			 smallest=arr[i];
		 }
	}
	 int s2=arr[0];
	 for(int i=1;i<arr.length;i++) {
		 if(s2>arr[i] && arr[i]!=smallest) {
			 s2=arr[i];
		 }
	 }
	 System.out.println("smallest is "+ smallest);
	 System.out.println("2 smallest is "+ s2);
 }
}
