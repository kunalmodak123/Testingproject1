package core_java;

import java.util.Scanner;

public class ForLoop_Factorial_17Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		//sum=factorial
		
		int sum = 1;
		for(int i=1;i<=num;i++)
		{
			sum = sum*i;
		}	
		System.out.println("Factorial of "+num+" is "+sum);
	}

}

//1= 1*2 = 2
//2= 2*3 = 6
//6= 6*4 = 24
//24=24*5=120

//1= 1*2 = 2
//2= 2*3 = 6
//6= 6*4 = 24
//24=24*5=120
//120=120*6=720
//720=720*7=5040
