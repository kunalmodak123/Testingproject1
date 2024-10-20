package core_java;

import java.util.Scanner;

public class String_ContainMethod_24Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a String");
		String str = sc.nextLine();
		
		String str2 = "Hello Everyone";
		
		boolean b = str2.contains(str);
		if (b) 
		{
			System.out.println("Contain has been found during search");
		} 
		else 
		{
			System.out.println("Contain has been not found during search");
		}
	}
}
