import java.util.*;

public class PrintDayOfWeek
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Week : ");
		int week = sc.nextInt();
		
		switch(week)
		{
			case 1 :
			{
				System.out.println("Day is Monday"); 
				break;
			}
			case 2 :
			{
				System.out.println("Day is Tuesday"); 
				if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
					System.out.println("and Year is Leap Year");
				break;
			}
			case 3 :
			{
				System.out.println("Day is Wednesday"); 
				break;
			}
			case 4 :
			{
				System.out.println("Day is Thusday"); 
				break;
			}
			case 5 :
			{
				System.out.println("Day is Friday"); 
				break;
			}
			case 6 :
			{
				System.out.println("Day is Saturday"); 
				break;
			}
			case 7 :
			{
				System.out.println("Day is Sunday"); 
				break;
			}
			default :  
			{
				System.out.println("Invalid Number of Weeks");
				break;
			}
		
		}
	}
}
			 
 			