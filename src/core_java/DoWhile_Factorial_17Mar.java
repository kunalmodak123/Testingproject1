package core_java;

import java.util.Scanner;

public class DoWhile_Factorial_17Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		do 
		{
			System.out.println("Enter Number");
			int num = sc.nextInt();
			
			int sum = 1;
			for(int i=1;i<=num;i++)
			{
				sum=sum*i;
			}
			System.out.println("factorial of a "+num+" is "+sum);
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
		while (b);
	}		
}
