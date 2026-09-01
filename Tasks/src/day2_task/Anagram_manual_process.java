package day2_task;
import java.util.Scanner;
public class Anagram_manual_process {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		        int count = 0;

		        if (str1.length() == str2.length()) {

		            for (int i = 0; i < str1.length(); i++) {

		                for (int j = 0; j < str2.length(); j++) {

		                    if (str1.charAt(i) == str2.charAt(j)) {
		                        count++;
		                        break;
		                    }
		                }
		            }

		            if (count == str1.length())
		                System.out.println("it is an Anagram");
		            else
		                System.out.println("it is Not Anagram");

		        } else {
		            System.out.println("it is Not Anagram");
		        }
		    }
		}