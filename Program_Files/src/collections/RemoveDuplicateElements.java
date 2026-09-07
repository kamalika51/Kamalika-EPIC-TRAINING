package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElements {
		public static void main(String[] args) {
			ArrayList<Integer> li =new ArrayList<>();
			Scanner in =new Scanner(System.in);
			int n = in.nextInt();
			
			for(int i=0;i<n;i++) {
				li.add(in.nextInt());
			}
			//System.out.println(li.contains(10));   //10 20 10 10 20 30
	        for(int i=0;i<n; ){
	        	if(li.contains(li.get(i)) && li.indexOf(li.get(i)) !=i) {  //10(0) && 10(0) ->false
	        		li.remove(i);
	        		n--;
	        	}
	        	else {
	        		i++;
	        	}
	        	
	        }
	        System.out.println(li);
		}
		}




