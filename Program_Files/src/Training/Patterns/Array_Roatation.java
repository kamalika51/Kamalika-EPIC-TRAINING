package Training.Patterns;
import java.util.Scanner;

public class Array_Roatation {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int[] arr=new int[n];
				//int rot=sc.nextInt();
				for(int i=0;i<n;i++){
				    arr[i]=sc.nextInt();
				}
				int rot=sc.nextInt();
				int k=0;
				while(k<rot) {
				int temp=arr[0];
				for(int i=0;i<n-1;i++){
				    arr[i]=arr[i+1];
				}
				arr[n-1]=temp;
				k++;
				}
				                                      //array rotation one ->arr[i]=arr[i+1] ,temp=n-1 
				                                        //same for multi rotation=using while loop and rot count
				for(int i=0;i<n;i++){
				    System.out.println(arr[i]);
				}
			}
		

}
