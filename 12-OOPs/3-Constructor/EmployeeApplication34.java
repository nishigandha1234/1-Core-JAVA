/*Question 34: Write a Java program to find department wise employee count.
Description: Create Employee class with empId, name and department. Store employees. Count how many employees belong to each department.
INPUT: 1 Raj IT 2 Neha HR 3 Amit IT 4 Pooja HR 5 Kiran Sales
OUTPUT: IT Employees: 2 HR Employees: 2 Sales Employees: 1
EXPLANATION: Create Employee class with fields empId, name, department. Use constructor to initialize. Store 5 employees in array. Count employees for each department. Loop through array, if department == "IT" increment IT count, if "HR" increment HR count, if "Sales" increment Sales count. Display department wise count.*/

import java.util.*;
class Employee
{
	private int empId;
	private String name;
	private String department;

	Employee(int empId, String name,String department)
	{
		this.empId = empId;
		this.name = name;
		this.department = department;
	}
	public void setId(int empId)
	{
		this.empId = empId;
	}
	public int getempId()
	{
		return empId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setdepartment(String department)
	{
		this.department = department;
	}
	public String getdepartment()
	{
		return department;
	}
}
public class EmployeeApplication34
{
	public static void main(String x[])
	{
		Employee[] n = new Employee[5];
	
		n[0] = new Employee(1, "Raj", "IT");
		n[1] = new Employee(2, "Neha","HR");
		n[2] = new Employee(3, "Amit","IT");
		n[3] = new Employee(4, "Pooja","HR");
		n[4] = new Employee(5, "Kiran","Sales");
		
		int countIT = 0, countHR = 0, countSales = 0;
		
		for(int i = 0 ; i < n.length ; i++)
		{
			if("IT".equals(n[i].getdepartment()))
				countIT++;
			else if("HR".equals(n[i].getdepartment()))
				countHR++;
			else 
				countSales++;
		}
		System.out.println("IT Employees : "+countIT);
		System.out.println("HR Employees : "+countHR);
		System.out.println("Sales Employees : "+countSales);
	}
}
