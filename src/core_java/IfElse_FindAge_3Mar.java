package core_java;

import java.util.Scanner;

public class IfElse_FindAge_3Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of Ajay");
		int ajayage = sc.nextInt();
		System.out.println("Enter age of Vijay");
		int vijayage = sc.nextInt();
		
		if (ajayage>vijayage)
		{
			System.out.println("Ajay is Elder");
		} 
		else 
		{
			System.out.println("Vijay is Elder");
		}	
	}
}
