package core_java;

import java.util.Scanner;

public class WhileLoop_Game_17Mar {

	public static void main(String[] args) {
		
		int attempt = 3;
		int maxattempt = 0;
		boolean b = true;
		while (true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Action: 'attack', 'defend', 'escape'");
			String action = sc.next();
			switch (action) 
			{
			case "attack":
				 b = true;
				break;
			case "defend":
				 b = true;
				break;
			case "escape":
				 b = true;
				break;

			default:
				b = false;
				break;
			}
			if (b) 
			{
				System.out.println("action "+action+" has been performed");
			} 
			else 
			{
				System.out.println("Invalid action "+action);
				attempt--;
				System.out.println(attempt+" attempt has been left");
			}
			if (attempt==maxattempt) 
			{
				System.out.println("Game Over");
				break;
			}
		}
	}
}
