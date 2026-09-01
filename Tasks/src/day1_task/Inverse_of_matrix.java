package day1_task; //2 by 2 matrix without optimize
import java.util.Scanner;
public class Inverse_of_matrix {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();
	    int[][] arr = new int[rows][cols];
	
	    for(int i=0;i<rows;i++) {
	    	    for(int j=0;j<cols;j++) {
	    		    arr[i][j] = in.nextInt();
	    	}
	    }
	    
	    double det=(arr[0][0]*arr[1][1] - arr[0][1] *arr[1][0]);
	    if(det != 0) {
	    	double[][] inverse = new double[rows][cols];
		    inverse[0][0] = (double)arr[1][1]/det;
		    inverse[1][0] = (double)-(arr[1][0])/det;
		    inverse[0][1] = (double)-(arr[0][1])/det;
		    inverse[1][1] = (double) arr[0][0]/det;
		    
		    
		   for(int i=0;i<rows;i++) {
		       	for(int j=0;j<cols;j++) {
		    		System.out.print(inverse[i][j]+" ");
		    	}
		       	System.out.println();
		    }
	    }
	    else {
	    	
	    System.out.println("inverse not exits");
	}

}
}
