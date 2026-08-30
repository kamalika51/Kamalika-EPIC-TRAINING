package Training.Patterns;

import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0||i== j) 
				System.out.print("* ");
				else
                    System.out.print("  ");
				
			}
			System.out.println();
		}
		
		  for(int i =n - 2;i >= 0;i--) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0||i== j) 
				System.out.print("* ");
				else
                    System.out.print("  ");
				
			}
			System.out.println();
		}

	}
}
