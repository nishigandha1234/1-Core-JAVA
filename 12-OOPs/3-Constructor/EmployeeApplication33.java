/*Question 33: Write a Java program to implement constructor chaining in Employee class.
Description: Create Employee class with id, name, salary and department. Use constructor chaining (this()) to initialize values and display employee details.
INPUT: 101 Amit 30000 IT
OUTPUT: Employee Details: Id:101 Name:Amit Salary:30000 Department:IT
EXPLANATION:Create Employee class with fields id, name, salary, department. Use constructor chaining: public Employee(int id, String name, int salary, String dept) { this.id=id; this.name=name; this.salary=salary; this.department=dept; }. Can also create overloaded constructors calling each other using this(). Display all employee details using display method*/

import java.util.*;
class Employee
{
	private int id ;
	private int salary;
	private String name;
	private String department;

	Employee()
	{
		this(101);
	}
	Employee(int id)
	{
		this(id, "Amit");
	}
	Employee(int id, String name)
	{
		this(id, name, 30000);
	}
	Employee(int id, String name, int salary)
	{
		this(id, name, 30000, "IT");
	}
	Employee(int id, String name,int salary,String department)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setsalary(int salary)
	{
		this.salary = salary;
	}
	public int getsalary()
	{
		return salary;
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
public class EmployeeApplication33
{
	public static void main(String x[])
	{
		Employee n = new Employee();
		
		System.out.println("Employee Details : ");
		System.out.println("Id : "+n.getId());
		System.out.println("Name : "+n.getName());
		System.out.println("Salary : "+n.getsalary());
		System.out.println("Department : "+n.getdepartment());
	}
}
