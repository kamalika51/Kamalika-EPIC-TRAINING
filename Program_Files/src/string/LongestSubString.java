package string;

public class LongestSubString {
     public static void main(String args[]) {
    	 String str="10101101001";
    	 int subCount=0;
    	 for(int i=0;i<str.length();i++) {
    		 int sum=0;
    		 for(int j=i;j<str.length();i++) {
    			 if(str.charAt(j)==1) {
    				 sum+=1;
    			 }
    			 else {
    				 sum-=1;
    			 }
    		 }
    	    System.out.println(sum);
    	 }
    	 
     }
}
