package Training.Java_concepts;

import java.util.Scanner;

public class Count
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
     int count=0;
		while(num>0){
		  //  count++;
		  count=(count*10 )+ (num%10);
		    num=num/1;
		   System.out.println(num);
		}
		
	//	count++;
	}
}


/*import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num>0){
		  count++;
		  if(num%count){
		   System.out.println(num);
		  }
		    num=num/10;
		    
		    //num=count++;
		   // count++;
		    
		}
	//	System.out.println(count);
// 		count++;
	}
}*/