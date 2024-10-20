package core_java;

import java.util.Scanner;

public class IfElse_OddEvenUsingMod_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		if (number%2==0) 
		{
			System.out.println("Even");
		} 
		else 
		{
			System.out.println("Odd");
		}
	}
}
