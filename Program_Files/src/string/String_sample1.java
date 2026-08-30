package string;

public class String_sample1 {

	public static void main(String[] args) {
		//stores in string constant pool
		String str1="Hello";
		String str2="Hello";
		//heap->object
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str1==str2);//same memory address
		System.out.println(str3==str4);//different memory address
		
		

	}

}
