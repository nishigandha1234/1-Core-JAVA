import java.util.*;

public class CalculateSalary
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sales Amount : ");
		double salesAmount = sc.nextInt();
		
		if(salesAmount < 5000) 
		{
			salesAmount += 0.02;
		}
		else if(salesAmount >= 5000 && salesAmount <= 10000)
		{
			salesAmount += 0.05;
		}
		else 
		{
			salesAmount += 0.10;
		}
		System.out.println("The Commision Amount is : "+salesAmount);
	}
}