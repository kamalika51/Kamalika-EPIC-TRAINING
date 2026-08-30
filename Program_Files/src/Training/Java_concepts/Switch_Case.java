package Training.Java_concepts;
import java.util.Scanner;
public class Switch_Case {

	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int val=sc.nextInt();
	switch(val){
	    case 1:{
	        System.out.println("java");
	        break;
	    }
	    case 2:{
	        System.out.println("python");
	        break;
	    }
	    case 3:{
	        System.out.println("HTML");
	        break;
	    }
	    case 4:{
	        System.out.println("css");
	        break;
	    }
	    default:{
	        System.out.println("invaild");
	    }
	}
	}
	}

