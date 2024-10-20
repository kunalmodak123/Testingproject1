package core_java;

import java.util.Scanner;

public class String_ConcatMethod_24Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = sc.nextInt();
		System.out.println("Enter Value of B");
		int b = sc.nextInt();
		
		String cat = " of 2 variable ";
		System.out.println("Add".concat(cat)+(a+b));
		System.out.println("Sub".concat(cat)+(a-b));
		String con = "Mul";
		System.out.println(con.concat(cat)+a*b);
	}
}
