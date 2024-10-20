package core_java;

import java.util.Scanner;

public class IfElseIf_DaysUsingLadder_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day number : \n1. Monday\n2. Tuesday\n3. Wednesday\n4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
		int day = sc.nextInt();
		
		if (day==1) 
		{
			System.out.println("Monday");
		} 
		else if (day==2) 
		{
			System.out.println("Tuesday");	
		}
		else if (day==3) 
		{
			System.out.println("Wednesday");	
		}
		else if (day==4) 
		{
			System.out.println("Thursday");	
		}
		else if (day==5) 
		{
			System.out.println("Friday");	
		}
		else if (day==6) 
		{
			System.out.println("Saturday");	
		}
		else if(day==7) 
		{
			System.out.println("Sunday");	
		}
		else
		{
			System.out.println("Invalid day");
		}
	}
}
