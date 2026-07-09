/*Question 42: Create an abstract class Employee and calculate salary for different types of employees. Create an abstract class Employee with: Abstract method calculateSalary() Instance variable name Create two subclasses: FullTimeEmployee ? fixed monthly salary PartTimeEmployee ? hourly rate × hours worked The program should calculate and display salary based on employee type.
Input Employee Type: FullTime Name: Vivek Monthly Salary: 30000
Output Employee Name: Vivek Salary: 30000*/

abstract class Employee
{
	abstract void calcu
	abstract void calculateSalary();
} 
class FullTimeEmployee extends Employee
{
	
	public void calculateSalary()
	{
		
	}

}
class PartTimeEmployee extends Employee
{


}
public class EmployeeDriver
{
	public static void main(String x[])
	{
	}
}