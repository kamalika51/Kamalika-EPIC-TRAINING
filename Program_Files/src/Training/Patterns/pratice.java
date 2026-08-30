package Training.Patterns;
//import java.util.Scanner;
public class pratice {

	public static void main(String[] args) {
		//Scanner in=new Scanner(System.in);
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
		for(int s=i;s<(n*2)-i-1;s++) {
			System.out.print(" ");
		}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n;i>=0;i--) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
		for(int s=i;s<(n*2)-i-1;s++) {
			System.out.print(" ");
		}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
