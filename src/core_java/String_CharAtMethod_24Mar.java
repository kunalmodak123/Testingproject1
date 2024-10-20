package core_java;

import java.util.Scanner;

public class String_CharAtMethod_24Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a String");
		String str = sc.nextLine();
		
		char first = str.charAt(0);
		System.out.println("First Character of the String is "+first);
		
		int len = str.length();
		char last = str.charAt(len-1);
		System.out.println("Last Character of the String is "+last);
		
		
		
		
	}
}


