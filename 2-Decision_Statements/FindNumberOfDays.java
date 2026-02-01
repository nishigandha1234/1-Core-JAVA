import java.util.*;

public class FindNumberOfDays
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Month : ");
		int month = sc.nextInt();
		
		switch(month)
		{
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			{
				System.out.println("Number of Days = 31"); 
				break;
			}
			case 4 : case 6 : case 9 : case 11 :
			{
				System.out.println("Number of Days = 30");
				break;
			}
			case 2 : 
			{
				System.out.println("Number of Days = 28");
				break;
			}
			default :  
			{
				System.out.println("Number of Days = 28");
				break;
			}
		
		}
	}
}
			 
 			