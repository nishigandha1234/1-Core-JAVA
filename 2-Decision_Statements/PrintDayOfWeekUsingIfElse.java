import java.util.*;

public class PrintDayOfWeekUsingIfElse
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Week : ");
		int week = sc.nextInt();
		
		if(week == 1) System.out.println("Day is Monday");
		else if(week == 2) System.out.println("Day is Tuesday"); 
		else if(week == 3) System.out.println("Day is Wednesday"); 
		else if(week == 4) System.out.println("Day is Thursday"); 
		else if(week == 5) System.out.println("Day is Friday"); 
		else if(week == 6) System.out.println("Day is Saturday"); 
		else if(week == 7) System.out.println("Day is Sunday"); 
		else System.out.println("Invalid Number of Week");
	}
}
			 
 			