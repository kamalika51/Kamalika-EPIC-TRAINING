package Training.Patterns;

public class HollowButterfly {
   public static void main(String args[]) {
	   int n=10;
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<n*2-1;j++) {
			   if(j==0||(i+j)==(n*2)-2 || i==j ||j==(n*2)-2 ) {
			   System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
		   }
		   
		   System.out.println();
	   }
	   
	   for(int i=n-2;i>=0;i--) {
		   for(int j=0;j<n*2-1;j++) {
			   if(j==0||(i+j)==(n*2)-2 || i==j ||j==(n*2)-2 ) {
			   System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
		   }
		   
		   System.out.println();
	   }
	   
	   
	   
   }
}


/* j<=i   || i==2*2
  my j<(2*n-i)-1  0<10-0-1 =>0<9
  
  if(j<=1;(i+j)>=n*2-1) whole star
  
  Sysout("(" +i+ ","  +j+  ")" + " ");
*/