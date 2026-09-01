package string;
import java.util.Scanner;
public class Substring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.nextLine();
		String substr = in.nextLine();
		
		for(int k=0;k<str.length();k++) {
			String empstr="";
		for(int i=k;i<str.length();i++) {
			for(int j=k;j<=i;j++) {
				empstr+=str.charAt(j);
			}
			if(empstr.equals(substr)){
		        System.out.println("Its a SubString");
		    }
		}
		}
	}

}
