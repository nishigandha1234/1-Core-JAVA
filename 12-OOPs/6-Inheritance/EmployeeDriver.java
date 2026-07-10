/*Question 42: Create an abstract class Employee and calculate salary for different types of employees. Create an abstract class Employee with: Abstract method calculateSalary() Instance variable name Create two subclasses: FullTimeEmployee ? fixed monthly salary PartTimeEmployee ? hourly rate × hours worked The program should calculate and display salary based on employee type.
Input Employee Type: FullTime Name: Vivek Monthly Salary: 30000
Output Employee Name: Vivek Salary: 30000*/

abstract class Employee
{
	String name;
	Employee(String name)
	{
		this.name = name;
	}
	abstract void calculateSalary();
} 
class FullTimeEmployee extends Employee
{
	int monthlySalary;
	
	FullTimeEmployee(String name, int monthlySalary)
	{
		super(name);
		this.monthlySalary = monthlySalary;
	}
	public void calculateSalary()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Salary : "+ monthlySalary);
	}
}
class PartTimeEmployee extends Employee
{
	int hourlyRate;
	int	hoursWorked;

	PartTimeEmployee(String name,int hourlyRate, int hoursWorked)
	{
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	public void calculateSalary()
	{
		int salary = hourlyRate * hoursWorked;
		
		System.out.println("Employee Name : "+name);
		System.out.println("Salary : "+salary);
	}
}
public class EmployeeDriver
{
	public static void main(String x[])
	{
		Employee e1 = new FullTimeEmployee("Rahul", 12000);
		e1.calculateSalary();
		System.out.println();
		e1 = new PartTimeEmployee("Amol", 200, 120);
		e1.calculateSalary();
	}
}