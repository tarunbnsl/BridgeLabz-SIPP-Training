package Day3_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class copiedElements {
    	    public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);

    	        System.out.print("Enter number of rows: ");
    	        int rows = scanner.nextInt();

    	        System.out.print("Enter number of columns: ");
    	        int columns = scanner.nextInt();

       	        int[][] matrix = new int[rows][columns];
 
    	        System.out.println("Enter the elements of the 2D array:");
    	        for (int i = 0; i < rows; i++) {
    	            for (int j = 0; j < columns; j++) {
    	                System.out.print("Element [" + i + "][" + j + "]: ");
    	                matrix[i][j] = scanner.nextInt();
    	            }
    	        }

    	        int[] array = new int[rows * columns];
    	        int index = 0;
    	        for (int i = 0; i < rows; i++) {
    	            for (int j = 0; j < columns; j++) {
    	                array[index] = matrix[i][j];
    	                index++;
    	            }
    	        }
    	        System.out.println("Elements copied to 1D array: " + Arrays.toString(array));

    	        scanner.close();
    	 }
  }

