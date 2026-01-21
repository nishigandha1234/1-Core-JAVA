import java.util.*;

class FindGrossSalary
{
	public static void main(String[] x)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary : ");
		double basicSal = sc.nextDouble();
	
		double hra,da;
		
		double grossSalary = basicSal + hraAmount + daAmount;
		
        System.out.println("Gross Salary: " + grossSalary);
	}
}
