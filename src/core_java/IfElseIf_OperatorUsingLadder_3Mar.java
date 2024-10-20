package core_java;

import java.util.Scanner;

public class IfElseIf_OperatorUsingLadder_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = sc.nextInt();
		System.out.println("Enter Value of B");
		int b = sc.nextInt();
		System.out.println("Enter Method : \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus");
		int method = sc.nextInt();
		
		if (method==1) 
		{
			System.out.println("a+b = " +(a+b));		
		} 
		else if (method==2)
		{
			System.out.println("a-b = " +(a-b));
		}
		else if (method==3)
		{
			System.out.println("a*b = " +(a*b));
		}
		else if (method==4)
		{
			System.out.println("a/b = " +(a/b));
		}
		else if (method==5)
		{
			System.out.println("a%b = " +(a%b));
		}
		else
		{
			System.out.println("Invalid Method");
		}
	}
}
