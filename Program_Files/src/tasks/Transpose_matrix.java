package tasks;
import java.util.Scanner;

public class Transpose_matrix {
	public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
  int rows = in.nextInt();
  int cols = in.nextInt();
  int[][] arr = new int[rows][cols];
  
  for(int i=0;i<rows;i++) {
	  for(int j=0;j<cols;j++) {
		  arr[i][j] = in.nextInt();
	  }
  }
  
  for(int i=0;i<rows;i++) {
	  for(int j=0;j<cols;j++) {
		  System.out.print(arr[j][i]+" ");
	  }
	  System.out.println();
}
}
}