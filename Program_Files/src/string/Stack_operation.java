package string;
import java.util.Scanner;
public class Stack_operation {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        int output = str.charAt(0)-'0';
        int n=str.length();
        for(int i=(n/2)+1;i<n;i++) {
        	int m = i-(str.length()/2);
        	
        	    switch(str.charAt(i)) {
        	    case '+':{
        	    	output +=str.charAt(m)-'0';
        	    	break;
        	    }
        	    
            case '-':{
        	    	output -=str.charAt(m)-'0';
        	    	break;
        	    }
            case '*':{
    	     	output *=str.charAt(i)-'0';
    	     	break;
    	      }
            
            case '/':{   	    	
    	      	output /=str.charAt(m)-'0';
    	      	break;
    	    }
            case '%':{    	    	
    	       	output %=str.charAt(m)-'0';
    	       	break;
    	       }

        	    
        	    }
        	   
        }
        System.out.println(output);
	}
	

}
