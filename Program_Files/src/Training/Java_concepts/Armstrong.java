package Training.Java_concepts;

public class Armstrong
{
	public static void main(String[] args) {
		int n = 153;//1+125+27==>153
		int temp = n;//153
		int count= 0;
	
		while(n>0){
	
		    count++;
		    n=n/10;//
	
		}
		int sum = 0;
		int check = sum;
		 while(temp>0){
		     int i = 0;
		     int pro=1;
		     while(i<count){
		         pro=pro*(temp%10);
		         i++;
		     }
		     sum+=pro;
		     temp/=10;
		 }
		 if(check == temp)
		 System.out.print("Its Amstrong");
		 else
		 System.out.print("Not an Amstrong");
	}
}