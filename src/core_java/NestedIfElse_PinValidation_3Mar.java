package core_java;

import java.util.Scanner;

public class NestedIfElse_PinValidation_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pin");
		int pin = sc.nextInt();
		
		if (pin>=1000&&pin<=9999) 
		{
			if (pin==1992) 
			{
				System.out.println("Access Granted");
			} 
			else 
			{
				System.out.println("Access Denied");
			}
		} 
		else 
		{
			System.out.println("Pin should be four digits");
		}
	}
}
