package Training.Patterns;
import java.util.Scanner;
public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) { 
			for(int s=0;s<i+1;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
