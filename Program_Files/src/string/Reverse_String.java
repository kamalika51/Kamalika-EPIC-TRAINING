package string;
import java.util.Scanner;
public class Reverse_String {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			String empStr="";
			for(int i=str.length();i>0;i--) {
				empStr+=str.charAt(i-1);
				empStr+=" ";
			}
			System.out.println(empStr);

		}

	}


//using static
/*
import java.util.Scanner;

public class Main
{       //static for without
    static String reverseString(String str){
        //write the code here
         String  empStr="";
        for(int i=str.length();i>0;i--) {
				empStr+=str.charAt(i-1)+" ";
				
			}
			return empStr;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Main.reverseString(str);
		System.out.println(Main.reverseString(str));
	}
}
*/
