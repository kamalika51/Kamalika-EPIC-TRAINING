package Training.Arrays;
import java.util.Scanner;
public class Copy_arr {
	//copying one array to another array
	
		public static void main(String[] args) {
		    Scanner in=new Scanner(System.in);
		    
		    
		    int size=in.nextInt();
		    int[] arr1=new int[size];
		    int[] arr2=new int[size];
		    for(int i=0;i<size;i++){
		        arr1[i]=in.nextInt();
		    }
		    for(int i=0;i<size;i++){
		        arr2[i]=arr1[i];
		    }
		    System.out.println("Copied Array");
		    for(int i=0;i<size;i++){
		        System.out.println(arr2[i]);
		    }
		    
		    
		  
		    
			
		}
	}


