import java.util.*;

public class CalculateGrossSalary
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary : ");
		double basicSal = sc.nextInt();
		if(basicSal <= 10000)
		{
			double hra = 0.20;
			double da =  0.80;
			double grossSal = basicSal + hra + da;
			System.out.println(" Gross Salary is : "+(grossSal));
		}
		else if(basicSal <= 20000)
		{
			double hra =  0.25;
			double da =  0.90;
			double grossSal = basicSal + hra + da;
			System.out.println(" Gross Salary is : "+(grossSal));
		}
		else if(basicSal > 20000)
		{
			double hra = 0.30;
			double da = 0.95;
			double grossSal = basicSal + hra + da;
			System.out.println(" Gross Salary is : "+(grossSal));
		}
	}
}