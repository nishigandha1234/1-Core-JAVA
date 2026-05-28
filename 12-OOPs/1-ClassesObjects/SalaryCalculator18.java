/*Question 18: Write a Java program to implement a Salary Calculator using Method Overloading.Create a class Salary and overload method salary():
- salary(int basic) => Print basic salary
- salary(int basic, int bonus) => Calculate total salary
- salary(int basic, int bonus, int tax) => Calculate final salary after tax
Input: Enter Basic Salary : 20000 Enter Bonus : 5000 Enter Tax : 2000
Output: Basic Salary : 20000 Total Salary : 25000 Final Salary : 23000*/

import java.util.Scanner;
class Salary
{
	void salary(int basic)
	{
		System.out.println("Basic Salary : " + (basic));
	}
	void salary(int basic, int bonus) 
	{
		System.out.println("Total Salary : " + (basic+bonus));
	}
	void salary(int basic, int bonus, int tax) 
	{
		System.out.println("Final Salary : " + ((basic+bonus)-tax));
	}
}
public class SalaryCalculator18
{
	public static void main(String x[])
	{
		Salary s1 = new Salary();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic salary : ");
		int basic = sc.nextInt();
		System.out.println("Enter Bonus : ");
		int bonus = sc.nextInt();
		System.out.println("Enter tax : ");
		int tax = sc.nextInt();
	
		s1.salary(basic);
		s1.salary(basic, bonus);
		s1.salary(basic, bonus, tax);
	}
}