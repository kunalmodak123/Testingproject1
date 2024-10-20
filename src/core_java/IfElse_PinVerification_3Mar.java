package core_java;

import java.util.Scanner;

public class IfElse_PinVerification_3Mar {

	public static void main(String[] args) {
		
		int pin1 = 1234;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin2");
		int pin2 = sc.nextInt();
		
		if (pin1==pin2) 
		{
			System.out.println("Pin is Correct");
		} 
		else 
		{
			System.out.println("Pin is Incorrect");
		}
	}
}
