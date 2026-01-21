import java.util.*;

class FindNetSalary
{
	public static void main(String[] x)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary : ");
		double basicSal = sc.nextDouble();
		System.out.println("Enter the Tax Percentage : ");
		int taxPerc = sc.nextInt();
		
		double netSalary = basicSal -= (basicSal * taxPerc / 100);
		
		System.out.println("--- Employee Salary Details ---");
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("Net Salary: " + netSalary);
	}
}
