package core_java;

import java.util.Scanner;

public class String_EqualsIgnoreMethod_24Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a String");
		String str = sc.nextLine();
		
		String str2 = "Hello Everyone";
		boolean b = str.equalsIgnoreCase(str2);
		System.out.println(b);
	}
}
