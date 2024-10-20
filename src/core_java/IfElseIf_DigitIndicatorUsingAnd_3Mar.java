package core_java;

import java.util.Scanner;

public class IfElseIf_DigitIndicatorUsingAnd_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		if (number>-10&&number<10)
		{
			System.out.println("one Digit");
		}
		else if (number>-100&&number<100) 
		{
			System.out.println("Two Digit");
		}
		else if (number>-1000&&number<1000) 
		{
			System.out.println("Three Digit");
		}
		else if (number>-10000&&number<10000) 
		{
			System.out.println("Four Digit");
		}
		else if (number>-100000&&number<100000) 
		{
			System.out.println("Five Digit");
		}
	}
}
