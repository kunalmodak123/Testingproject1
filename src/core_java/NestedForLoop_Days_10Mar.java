package core_java;


  public class NestedForLoop_Days_10Mar {
  
  public static void main(String[] args) {
 
		
		for(int i=1;i<=52;i++)
		{
			System.out.println("Week: "+i);
			for(int j=1;j<=7;j++)
			{
				switch (j) 
				{
				case 1:
					System.out.println("Mon");
					break;
				case 2:
					System.out.println("Tue");
					break;
				case 3:
					System.out.println("Wed");
					break;
				case 4:
					System.out.println("Thu");
					break;
				case 5:
					System.out.println("Fri");
					break;
				case 6:
					System.out.println("Sat");
					break;
				case 7:
					System.out.println("Sun");
					break;

				default:
					break;
				}
			}
		}

	}

}
