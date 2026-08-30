package Training.Java_concepts;
import java.util.Scanner;

public class Divisor
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int divisor=1;
		while(num/divisor != 0){
		    divisor *= 10;
		}
		    divisor /=10;
		while(num>0){
		    System.out.println(num/divisor);
		    num=num%divisor;
		    divisor/=10;
		   
	}
	}
}
