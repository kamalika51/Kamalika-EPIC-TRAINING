package Training.Arrays;
import java.util.Scanner;
public class Count_of_max_arr {
	                 public static void main(String args[]) {                            //count of maxing subarray target based
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++){
			    arr[i]=sc.nextInt();
			}
			int target=sc.nextInt();
			for(int i=0;i<arr.length;i++){
			      int sum=0;
			  for(int j=i;j<arr.length;j++)
			  {
			    sum+=arr[j];
			    
			    
			    if(sum==target)
			    {
			        //System.out.println(sum);
			        for(int m=i;m<=j;m++)
			        {
			            System.out.print(arr[m]);
			        }
			    }
			  }
			  System.out.println();
				}
			//	System.out.println();
	}
	}

