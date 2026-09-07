package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Sample_Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> li =new ArrayList<>();
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			li.add(in.nextInt());
		}
		System.out.println(li.contains(10));
     //   System.out.println(li);
	}

}
