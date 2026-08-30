package Training.Arrays;
import java.util.Scanner;
public class Second_largest_method2 {
	//k=2 second largest number
	
	
		public static void main(String[] args) {
		    Scanner in=new Scanner(System.in);
		    
		    
		    int size=in.nextInt();
		    int[] arr=new int[size];
		   
		    for(int i=0;i<size;i++){
		        arr[i]=in.nextInt();
		    }
		    int k=in.nextInt();
		    int count=1;
		    for(int i=0;i<size;i++){
		        for(int j=i+1;j<size;j++){
		            if(arr[j]>arr[i]){
		                int temp=arr[i];
		                arr[i]=arr[j];
		                arr[j]=temp;
		            }
		        }
		        //System.out.println(arr[i]);
		    }
		    for(int i=0;i<size;i++){
		        if(arr[i]!=arr[i+1]){
		            count++;
		            
		        }
		        if(count==k){
		            System.out.println(arr[i+1]);
		            break;
		        }
		    }
		   
		 }
	
}
