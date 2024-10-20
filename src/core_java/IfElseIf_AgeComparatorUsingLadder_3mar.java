
package core_java;

import java.util.Scanner;

public class IfElseIf_AgeComparatorUsingLadder_3mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		if (age>0&&age<3) 
		{
			System.out.println("Infant");
		}
		else if (age>2&&age<13) 
		{
			System.out.println("Child");
		}
		else if (age>12&&age<18) 
		{
			System.out.println("Teenager");
		}
		else if (age>17&&age<60) 
		{
			System.out.println("Adult");
		}
		else if (age>59&&age<100) 
		{
			System.out.println("Senior Citizen");
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
}
