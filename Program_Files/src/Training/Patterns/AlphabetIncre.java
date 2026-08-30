package Training.Patterns;
import java.util.Scanner;
public class AlphabetIncre {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int a=0;
	for(char i=0;i<str.length();i++) {
	a = str.charAt(i)+1;
	if(a>122){
        a=97;
        System.out.println((char)a);
    }
    else{
        System.out.println((char)a);

	}
	

	}
	}
	}

