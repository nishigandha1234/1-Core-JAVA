import java.util.*;

public class SalaryHike
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary : ");
		double sal = sc.nextDouble();
		System.out.println("Enter the Years of Service : ");
		int years = sc.nextInt();
		System.out.println("Enter the Performance Rating in 1 to 5 : ");
		int rating = sc.nextInt();
		
		if(rating >= 4 && years > 5 )
			sal += 0.20;
		else if(rating >= 3 && years > 5)
			sal += 0.10;
		else
			sal += 0.05;
			
		System.out.println("New Salary is : "+sal);
	}
}