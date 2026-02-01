import java.util.*;

public class PrintDayOfWeekSwitch
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
				System.out.println("Weekday"); 
				break;
			}
			case 2 :
			{
				System.out.println("Weekday"); 
				break;
			}
			case 3 :
			{
				System.out.println("Weekday"); 
				break;
			}
			case 4 :
			{
				System.out.println("Weekday"); 
				break;
			}
			case 5 :
			{
				System.out.println("Weekday"); 
				break;
			}
			case 6 :
			{
				System.out.println("Weekend"); 
				break;
			}
			case 7 :
			{
				System.out.println("Weekend"); 
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
			 
 			