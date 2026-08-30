package Training.Patterns;
import  java.util.Scanner;
public class Maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b && a>c && a>d){
		System.out.println("A is greater");
		}
		else if(b>a && b>c && b>d){
		System.out.println("B is greater");
		}
		else if(c>a && c>b && c>d){
		System.out.println("c is greater");
		}
		else{
		System.out.println(" D is greater");
		}


	}

}
