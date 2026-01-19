import java.util.*;

class CalculateSalary
{
	public static void main(String[] x)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary : ");
		double basicSal = sc.nextDouble();
		System.out.println("Enter the HRA Amount : ");
		double hraPercentage = sc.nextDouble() / 100;
		System.out.println("Enter the DA Percentage : ");
		double daPercentage = sc.nextDouble()/ 100;
		System.out.println("Enter the Tax : ");
		double taxPercentage = sc.nextDouble() / 100;
		
		double hraAmount = basicSal * hraPercentage;
		double daAmount = basicSal * daPercentage;
		
		double grossSalary = basicSal + hraAmount + daAmount;
		
		double taxSalary = basicSal + taxPercentage;
		
		double netSalary = grossSalary - taxSalary;

		System.out.println("--- Employee Salary Details ---");
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("HRA (10%): " + hraAmount);
        System.out.println("DA (5%): " + daAmount);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax (2% of Gross): " + taxSalary);
        System.out.println("-----------------------------");
        System.out.println("Net Salary: " + netSalary);
	}
}
