package Training.Arrays;
import java.util.Scanner;
public class Largest_num {
	//largest Number
	
	
		public static void main(String[] args) {
		    Scanner in=new Scanner(System.in);
		    
		    
		    int size=in.nextInt();
		    int[] arr=new int[size];
		   
		    for(int i=0;i<size;i++){
		        arr[i]=in.nextInt();
		    }
		    int largest = arr[0];
		    for(int i=1;i<size;i++){
		        if(arr[i]>largest){
		            largest=arr[i];
		        }
		    }
		    
		   System.out.println(largest); 
		    
		  
		    
			
		}
	}

