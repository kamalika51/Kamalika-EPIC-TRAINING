package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MixedNumCharSymbol {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str = in.nextLine();
		ArrayList<Character> num = new ArrayList<>();
		ArrayList<Character> alph = new ArrayList<>();
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <='9') {
			num.add(str.charAt(i));
			}
			
			else if(str.charAt(i) >= 'a' && str.charAt(i) <='z') {
				alph.add(str.charAt(i));
			}
			else {
				
			}
			
		}
		Collections.sort(num);
		Collections.reverse(alph);
		System.out.println(num);
		System.out.println(alph);
		String emp="";
		int numInd=0,alphInd=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <='9') {
				 emp+=num.get(numInd);
			        numInd++;
				}
				
				else if(str.charAt(i) >= 'a' && str.charAt(i) <='z') {
					 emp+=alph.get(alphInd);
				        alphInd++;
				}
				else {
					 emp+=str.charAt(i);
				}
		
		
		}
		System.out.println(emp);
	}
}
//
//alph.add(i);
//Collections.reverse();
