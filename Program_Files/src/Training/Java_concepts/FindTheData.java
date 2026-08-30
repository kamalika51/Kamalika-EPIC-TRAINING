package Training.Java_concepts;
import java.util.Scanner;
public class FindTheData {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	char data=sc.next().charAt(0);
	System.out.println((int)data);//ascii value printing 
	if(data>='A'&& data<='Z' || data>='a' && data<='z'){
	System.out.println("it is an alphabet");
	}
	else if(data>'0' && data<'9'){
	System.out.println("it is an Number");
	}
	else{
	System.out.println("it is Special character");
	}
	}
	}
