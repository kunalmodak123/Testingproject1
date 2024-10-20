package core_java;

import java.util.Scanner;

public class NestedIfElse_FindAge_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age of Ajay");
		int ajayage = sc.nextInt();
		System.out.println("Enter Age of Vijay");
		int vijayage = sc.nextInt();
		
		if (ajayage!=vijayage) 
		{
			if (ajayage>vijayage) 
			{
				System.out.println("Ajay is Elder");
			} 
			else 
			{
				System.out.println("Vijay is Elder");
			}
		} 
		else 
		{
			System.out.println("Both Ajay and Vijay have Same Age");
		}
	}
}
