package core_java;

import java.util.Scanner;

public class DoWhile_Pin_17Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		do
		{
			System.out.println("Enter your Pin");
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
			System.out.println("Do You Want to Continue: 'Yes' , 'No'");
			String dec = sc.next();
			switch (dec) 
			{
			case "Yes":
				b = true;
				break;
			case "No":
				b = false;
				break;	

			default:
			    System.out.println("Invalid has been selected");
				b = false;
				break;
			}
		}
		while(b);
	}
}
