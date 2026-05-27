/*Question 3: Write a Java program to implement Employee Salary Classification.
Create a class Employee with attributes empId, name, and salary.
Determine salary category:
- Salary > 50000 => High Salary
- Salary 20000 to 50000 => Medium Salary
- Salary < 20000 => Low Salary
Input: Enter Employee Id : 201 Enter Name : Amit Enter Salary : 45000
Output: Employee Id : 201 Name : Amit Salary : 45000 Category : Medium Salary*/

import java.util.Scanner;
class Employee
{
	Scanner sc = new Scanner(System.in);
	private int empId = sc.nextInt();
	private String name = sc.next();
	private double salary = sc.nextDouble();
	
	void employeeSalaryClassify()
	{
		System.out.println("Employee Id : " + empId);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.print("Category : ");
		if(salary > 50000)
			System.out.println("High Salary");
		else if(salary >= 20000 && salary <= 50000)
			System.out.println("Medium Salary");
		else 
			System.out.println("Low Number");
	}
}

public class EmployeeSalaryClassification
{
	public static void main(String x[])
	{
		Employee e1 = new Employee();
		e1.employeeSalaryClassify();
	}
}