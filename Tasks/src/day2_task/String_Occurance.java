package day2_task;
import java.util.Scanner;
public class String_Occurance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int[] count = new int[26];
		int val;
		for(int i=0;i<str.length();i++) {
			 val=str.charAt(i)-'a';
			count[val]++;
			
		}
		System.out.println();
		
		for(int i=0;i<str.length();i++) {
			val =str.charAt(i)-'a';
			
			if(count[val]>0) {
				System.out.println(str.charAt(i)+" "+count[val]);
			}
			if(count[val]>1) {
				count[val] =0;
			}
		}

	}

}
