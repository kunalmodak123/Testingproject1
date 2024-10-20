package core_java;

import java.util.Scanner;

public class String_LengthMethod_24March {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a String");
		String str = sc.nextLine();
		
		System.out.println("Length of the String is "+str.length());

		
//      declare a variable and store it in the variable		
		int len = str.length();
		System.out.println("Length of the String is "+len);
	}
}
