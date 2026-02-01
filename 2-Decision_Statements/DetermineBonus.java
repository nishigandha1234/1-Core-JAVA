import java.util.*;

public class DetermineBonus
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Service Year : ");
		int serviceYear = sc.nextInt();
		System.out.println("Enter the Salary : ");
		double salary = sc.nextDouble();
	
		if(serviceYear > 5)
		{
			salary+=0.5;
			System.out.println("5% Bonus is applied on Salary : "+salary);
		}
		else 
		{
			System.out.println("NO Bonus is applied on Salary : ");
		}
	}
}