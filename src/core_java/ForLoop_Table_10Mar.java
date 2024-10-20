package core_java;

import java.util.Scanner;

public class ForLoop_Table_10Mar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int t = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+"*"+i+"="+t*i );
		}
	}
}


//t+"*"+i+"="+t*i