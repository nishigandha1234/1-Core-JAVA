import java.util.*;

class CalculateSalary
{
	public static void main(String[] x)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary : ");
		double basic = sc.nextDouble();
	
		double hra = basic * 0.10;
        double da = basic * 0.05;
        double tax = basic * 0.02;
		
        double netSalary = (basic > 0) ? (basic + hra + da - tax) : 0;
		
        System.out.println("Net Salary = " + netSalary);
	}
}
