import java.util.*;

class FindNetSalary
{
	public static void main(String[] x)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary : ");
		double basicSal = sc.nextDouble();
		System.out.println("Enter the allowances : ");
		double allowances = sc.nextDouble();
		System.out.println("Enter the deductions : ");
		double deductions = sc.nextDouble();
		System.out.println("Enter the Tax Percentage : ");
		int taxPerc = sc.nextInt();
	
		double grossSalary = basicSal + allowances;
		double taxableIncome = grossSalary - deductions;
		double tax = taxableIncome × taxPerc
		double netSalary = grossSalary - (tax + deductions);

		System.out.println("--- Employee Salary Details ---");
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax (2% of Gross): " + tax);
        System.out.println("-----------------------------");
        System.out.println("Net Salary: " + netSalary);
	}
}
