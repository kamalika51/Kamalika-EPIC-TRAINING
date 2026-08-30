package Training.Arrays;
import java.util.Scanner;
public class Third_largest {
	//give count=3 it gives the third largest value
	
	
		public static void main(String[] args) {
		    Scanner in =new Scanner (System.in);
		    
		    
		    int n=in.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
			{
			    arr[i]=in.nextInt();
			}
			int pos=in.nextInt();
			
			for (int i=0;i<n;i++){
			    for(int j=i+1;j<n;j++){
			        if(arr[j]>arr[i]){
			            int temp=arr[i];
			            arr[i]=arr[j];
			            arr[j]=temp;
			            
			        }
			    }
			   // System.out.print(arr[i]);
			}
	          int count=1;
	         
			        for(int i=0;i<n;i++){
	                 if(arr[i]!=arr[i+1]){
	                     count++;
	                     
	                 }
	                 if(count==pos){
	                 System.out.println(arr[i+1]);
			         break;       	       
	                 }
			        }  			
		}
	}

