package core_java;

import java.util.Scanner;

public class Forloop_Pin_10Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i=2;i>=0;i--)
		{
			System.out.println("Enter your pin");
			int pin = sc.nextInt();
			if (pin==1992) 
			{
				System.out.println("Access Granted");
				break;
			} 
			else if (i==0) 
			{
				System.out.println("Your Card has been Blocked");	
			}
			else 
			{
				System.out.println("Access Denied");
				System.out.println(i+" Attempt is left");
			}
		}
	}
}
