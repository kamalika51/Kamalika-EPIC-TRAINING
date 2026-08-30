package Training.Java_concepts;

public class Next_char2 {
	public static void main(String[] args) {
	    String str="xyz";
	    int a=0;
	    for(int i=0;i<str.length();i++){
	      a=str.charAt(i)+1;
	     
	      if(a>122){
	          a=97;
	          System.out.println((char)a);
	      }
	      else{
	          System.out.println((char)a);

	      }
	          
	}
}
}

