package Training.Java_concepts;

import java.util.Scanner;
public class Product{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int pro=1;
	while(n>0){
	    pro*=n%10;
	    n=n/10;
	}
	System.out.println(pro);
	}
}

