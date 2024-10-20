package core_java;

import java.util.Scanner;

public class ForLoop_PrimeNumber_10Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		boolean b = true;
        for(int i=2;i<num;i++)
		{
        	if(num%i==0)
        	{
			    b = false;
        	}
		}
        if (b) 
        {
        	System.out.println(num+ " is a prime Number");
		} 
        else 
		{
        	System.out.println(num+ " is not a prime Number");
		}
	}
}
