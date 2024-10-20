package core_java;

import java.util.Scanner;

public class NestedIfElse_EvenOdd_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		if (number!=0) 
		{
			if (number%2==0) 
			{
				System.out.println("Even");
			} 
			else 
			{
				System.out.println("Odd");
			}	
		} 
		else 
		{
			System.out.println("0 should not be entered");
		}
	}
}
