package core_java;

import java.util.Scanner;

public class StringMethod_Factorial_24Mar {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String dec;
		do 
		{
			System.out.println("Enter a Num");
			int num = sc.nextInt();
			int sum = 1;
			for(int i = 1; i<=num;i++)
			{
				sum = sum*i;
			}
			System.out.println("Factorial of a "+num+ " is "+sum);
			System.out.println("Do You Want to Continue : 'Yes' , 'No'");
			dec = sc.next();
		} 
		while (dec.equals("yes"));
	}
}
