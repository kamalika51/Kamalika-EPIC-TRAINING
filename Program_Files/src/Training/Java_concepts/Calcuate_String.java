package Training.Java_concepts;
import java.util.Scanner;
class Calcuate_String {
	
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			int output = str.charAt(0)-'0';
			for(int i=1;i<=str.length()/2;i++) {
				System.out.println();
				//System.out.println(str.charAt(i));
				switch(str.charAt(i+(str.length()/2))) {
					case '+':{
						output=output+(str.charAt(i)-'0');
						break;
					}
//					case '-':{
//						System.out.println("sub");
//						break;
//					}
				}
		
			}
			//l/2==>3
			//i=1+l/2==>4
			//i=2+l/2==>5
			//i=3+l/2==>6
		
			System.out.println(output);
		}
	}

