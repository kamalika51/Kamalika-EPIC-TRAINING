package string;
import java.util.Scanner;
//only lowercase
public class Alphabet_occurance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int[] count = new int[26];
				for(int i=0;i<str.length();i++){
				    int val = str.charAt(i) - 97;
				    count[val]++;
				}
				System.out.println();
//		 		for(int i=0;i<26;i++){
//		 		    if(count[i]>0)
//				System.out.println(count[i]+" ");
//		 		    System.out.println((char)(i+97)+" "+count[i]+" ");
//		 		}
				for(int i=0;i<str.length();i++){
				    int val = str.charAt(i) - 97;
				    if(count[val]>0){
				        System.out.println(str.charAt(i)+" "+count[val]);
				    }
				    if(count[val]>1){
				        count[val]=0;
				    }
				}
			}
		
}
