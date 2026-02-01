import java.util.*;

public class MinutesBilling
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Minutes used in a month: ");
		int minutes = sc.nextInt();
		int bill = 199;
		
		if(minutes > 100) 
			bill += 0;
		else if (minutes > 100 and minutes <= 300)
			bill += (minutes - 100) * 1;
		else if minutes > 300 and minutes <= 500
			bill += (200 * 1) + (minutes - 300) * 1.5;
		else if minutes > 500
			bill += (200 * 1) + (200 * 1.5) + (minutes - 500) * 2;
			
		System.out.println("New Salary is : "+sal);
	}
}