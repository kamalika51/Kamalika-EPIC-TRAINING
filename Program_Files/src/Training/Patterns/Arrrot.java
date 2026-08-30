package Training.Patterns;
import java.util.Scanner;
public class Arrrot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rot=sc.nextInt();
		int[] arr=new int[n];
		//int rot=sc.nextInt();
		for(int i=n-rot;i<n;i++){
		    arr[i]=sc.nextInt();
		}                                       // two loop to run when the input give start rotating
		for(int i=0;i<rot-1;i++){
		        arr[i]=sc.nextInt();
		    }
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}

	}

}

