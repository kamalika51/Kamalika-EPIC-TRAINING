package day2_task;
import java.util.Scanner;
public class Count_Char {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
			
		}
		System.out.println(count);
		

	}

}
