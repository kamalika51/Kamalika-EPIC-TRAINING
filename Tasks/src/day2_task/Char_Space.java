package day2_task;
import java.util.Scanner;
public class Char_Space {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String empStr ="";
		for(int i=0;i<str.length();i++) {
			empStr+=str.charAt(i)+" ";
		}
		System.out.println(empStr);
	}

}
