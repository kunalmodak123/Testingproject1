package core_java;

public class WhileLoopDemo_17Mar {

	public static void main(String[] args) {
		//increment
		int i =1;
		while (i<6)
		{
			System.out.println(i);
			i++;
		}
		System.out.println();
		System.out.println(i);
		System.out.println();
		//decrement
		int j =10;
		while (j>=1)
		{
			System.out.println(j);
			j--;
		}
		System.out.println();
		System.out.println(j);
		System.out.println();
		
		//infiniteloop
		while (true)
		{
			System.out.println("hello");
			break;
		}
		System.out.println("hello world");		
	}
}
