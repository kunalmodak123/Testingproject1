package core_java;

import java.util.Scanner;

public class String_UpperandLowerMethod_24March {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a String");
		String str = sc.nextLine();
		
		String upper = str.toUpperCase();
		System.out.println("Upper case of the given String is "+upper);
		
		String lower = str.toLowerCase();
		System.out.println("Lower case of the given String is "+lower);
	}
}

