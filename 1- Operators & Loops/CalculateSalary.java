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