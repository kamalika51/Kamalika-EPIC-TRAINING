package Training.Arrays;
import java.util.Scanner;
public class Occurance {
	
	
		public static void main(String[] args) {
		    Scanner in=new Scanner(System.in);
		    
		    
		    int size=in.nextInt();
		    int[] arr=new int[size];
		    for(int i=0;i<size;i++){
		        arr[i]=in.nextInt();
		    }
		    
		    
		    for(int i=0;i<size;i++){
		        int count=1;
		        for(int j=0;j<size;j++){
		            if(i!=j){
		                if(arr[i]==arr[j] &&j>i){
		                    count++;
		                    
		                }
		                else if(j<i && arr[i]==arr[j]){
		                    
		                   count=0;
		                    break;
		                }
		                else{
		                    
		                }
		            }
		        }
		        if(count>0){
		        System.out.println(arr[i] +"-" + count);
		        }
		    }
		    
			
		}
	}
