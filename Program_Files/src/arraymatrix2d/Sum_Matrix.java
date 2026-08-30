package arraymatrix2d;
import java.util.Scanner;
public class Sum_Matrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int rows=in.nextInt();
		int cols=in.nextInt();
		int[][] arr1=new int[rows][cols];
		int[][] arr2=new int[rows][cols];
	//	int[][] sum=new int[rows][cols]; 
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr1[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr2[i][j]=in.nextInt();
			}
		}
		

		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				//sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr1[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
