package Training.Java_concepts;

public class Factorial
{
	public static void main(String[] args) {
		int n = 156;//10
		int sum= 0;
		while(n>0){
		    int pro = 1;
		    for(int i=n%10;i>=1;i--){
		        pro=pro*i;
		        //pro = 1*1
	
	
		    }
		    sum=sum+pro;
		    //sum=720+120+1
		    //
		    n=n/10;//1
	
		}
		 System.out.println(sum);
	}
}

