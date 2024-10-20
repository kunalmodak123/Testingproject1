package core_java;

import java.util.Scanner;

public class IfElseIf_PercentageCalculatorUsingAnd_3Mar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Your Percentage");
		 Float percentage = sc.nextFloat();
		 
		 if (percentage>0&&percentage<34.99)
		 {
			 System.out.println("Fail");
		 }
		 else if (percentage>34.99&&percentage<61) 
		 {
			 System.out.println("Pass");	
		 }
		 else if (percentage>60&&percentage<76) 
		 {
			 System.out.println("Good");
		 }
		 else if (percentage>75&&percentage<99.99) 
		 {
			 System.out.println("Excellent");
		 }
	}
}
