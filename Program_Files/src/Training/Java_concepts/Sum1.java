package Training.Java_concepts;
import java.util.Scanner;
public class Sum1
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=1;
	while(n>0){
	    sum+=n%10;
	    n=n/10;
	}
	System.out.println(sum);
	}
}

