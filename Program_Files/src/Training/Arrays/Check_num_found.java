package Training.Arrays;
import java.util.Scanner;
public class Check_num_found {
	
		public static void main(String[] args) {
		    Scanner in=new Scanner(System.in);
		    
		    int product=1;
		    int size=in.nextInt();
		    int[] arr=new int[size];
		    for(int i=0;i<size;i++){
		        arr[i]=in.nextInt();
		    }
		    boolean val=true;
		    int search=in.nextInt();
		    for(int i=0;i<size;i++){
		        if(arr[i]==search){
		          System.out.print("Present"); 
		          val=false;
		          break;
		        }
		    }
	if(val){
	    System.out.print("Number not found");
	}
		    
	}

}
