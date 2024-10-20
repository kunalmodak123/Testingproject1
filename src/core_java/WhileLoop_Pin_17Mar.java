package core_java;

import java.util.Scanner;

public class WhileLoop_Pin_17Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter your pin");
			int pin = sc.nextInt();
			
			if (pin==1992) 
			{
				System.out.println("Access Granted");
				break;
			} 
			else 
			{
				System.out.println("Access Denied");
			}
		}
	}
}
