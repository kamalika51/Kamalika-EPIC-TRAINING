package Training.Arrays;
import java.util.Scanner;
public class Subarray1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n= sc.nextInt();
			int[] arr={1,2,2,1,2,5};
			for(int k=0;k<=n;k++){
			    for(int j=k;j<=n;j++){
			        for(int i=k;i<=j;i++){
			            System.out.print(arr[i]+" ");
			        }
			        System.out.println();
			    }
			    System.out.println();
			}
		}
	}