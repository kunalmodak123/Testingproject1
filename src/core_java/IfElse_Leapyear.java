package core_java;

import java.util.Scanner;

public class IfElse_Leapyear {

	public static void main(String[] args) {
		//Leap year divisible by 4 and 400 and not by 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		if ((year%4==0)&&(year%100!=0)||(year%400==0)) 
		{
			System.out.println("Leap year");		
		} 
		else 
		{
			System.out.println("Common Year");
		}
	}
}
