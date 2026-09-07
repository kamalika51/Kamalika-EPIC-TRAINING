package string;
import java.util.Scanner;
public class Sliding_Window {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str1 =in.nextLine();
		String str2 =in.nextLine();
		String empstr="";
		boolean isfound=false;
		
		for(int i=0;i<(str1.length()-str2.length())+1;i++) {
			empstr="";
			for(int j=i;j<str2.length()+i;j++) {
				empstr+=str1.charAt(j);	
				
			if(empstr.equals(str2)) {
				isfound=true;
			}
		
		}
			
		
	}
		//System.out.println(empstr);
		if(isfound) {
			System.out.println("substring  found");
		}
		else {
			System.out.println("substring not found");
		}

	}
}
