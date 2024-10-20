package core_java;

import java.util.Scanner;

public class ArrayDemo2_7Apr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int len = sc.nextInt();
		
		int arr[]=new int[len];
		System.out.println("Enter value of an array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
