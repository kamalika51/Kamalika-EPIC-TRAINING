package day2_task;
import java.util.Scanner;
public class Searching_String {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str = in.nextLine();
		char search = in.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			  char ch=str.charAt(i);
			  if(ch == search) {
					System.out.println("found");
					break;
				}
				
		}
		
		
	
	}

}
