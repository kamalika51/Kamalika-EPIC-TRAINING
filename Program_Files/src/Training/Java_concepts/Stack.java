package Training.Java_concepts;
import java.util.Scanner;
public class Stack {

     public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        int op=in.charAt(0)-'0';
        for(int i=1;i<=in.length()/2;i++){
            System.out.println();
      // System.out.println(in.charAt(i));
      switch(in.charAt(i+(in.length()/2))) {
          case '+':{
             op=op+(in.charAt(i)-'0');
					break;
          }
          case '-':{
             op=op-(in.charAt(i)-'0');
					break;
          }
          case '*':{
             op=op*(in.charAt(i)-'0');
					break;
          }
          case '/':{
             op=op/(in.charAt(i)-'0');
					break;
          }
          default :{
             System.out.println("Invaild");

 
          }
 
 
      }
 
    }
    System.out.println(op);
}
}

/*input=12345+*-/
out=1
input=642-+
oup=4

split number and operator
two number inside one operator
*/