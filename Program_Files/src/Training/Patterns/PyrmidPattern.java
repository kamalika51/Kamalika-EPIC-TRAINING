package Training.Patterns;
import java.util.Scanner;
public class PyrmidPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}





/* 
n=5
n  i=0 s=n-i-1  j=i+1  ,j=i
5  0    4         1     0
5  1    3         2     1
5  2    2         3     2
5  3    1         4     3
5  4    0         5     4

j=i*2+1; or j=i+i+1;


hollow 
j= =0 ->* ||i==n-1->*|| i*2 ==j

n-2 i>=0 i--  ->halfdiamond


*/