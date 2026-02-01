import java.util.*;

public class SalaryRangeEmployee
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Level (1-3) : ");
		int level = sc.nextInt();
		
		switch(level)
		{
			case 1 : 
			{
				System.out.println("Junior : Salary Range 20,000 - 30,000");
				break;
			}
			case 2 : 
			{
				System.out.println("Mid: Salary Range 31,000 - 50,000");
				break;			
			}
			case 3 :  
			{
				System.out.println("Senior: Salary Range 51,000 - 80,000");
				break;
			}
			default :
			{
				System.out.println("Invalid Employee Level");
			}
		}
	}
}