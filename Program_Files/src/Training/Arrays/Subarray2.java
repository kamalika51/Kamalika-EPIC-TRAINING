package Training.Arrays;
import java.util.Scanner;
public class Subarray2 {
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
			    arr[i]=sc.nextInt();
			    
			}
			//int k=sc.nextInt();
			for(int k=0;k<=n;k++){
			    //int k=sc.nextInt();
			    for(int j=k;j<=(n-2);j++){
			        for(int i=k;i<j+k;i++){
			            System.out.print(arr[i]+ " ");
			        }
			        System.out.println();
			    }
			    System.out.println();
			}
		}
	}