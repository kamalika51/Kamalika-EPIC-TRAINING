package Training.Arrays;
import java.util.Scanner;
public class Duplicate_occ {
	
	
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int[] ele=new int[n];
		    int[] dup=new int[n];
		    int[] temp_count = new int[n];
		    
		    for(int i=0;i<n;i++){
		     ele[i]=sc.nextInt();        
		    }
		
		     int count=1;
		    for(int i=0;i<n;i++){
		        if(dup[i]!=1){
		           
		        for(int j=i+1;j<n;j++){
		            if(ele[i]==ele[j]){
		                
		                dup[i]=2;
		                dup[j]=1;
		                count++;
		            }
		        }
		        temp_count[i]=count;
		    }
		    }
		    
		    for(int i=0;i<n;i++){
		        if(dup[i]==2){
		            if(dup[i]==2){
		            System.out.println("The dup occurancy"+" "+ele[i] +"-"+temp_count[i]);	        }

		            }
		           
		}
		}
	}

