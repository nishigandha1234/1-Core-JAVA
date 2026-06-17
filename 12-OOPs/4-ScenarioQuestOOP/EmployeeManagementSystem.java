/*Scenario 3: Employee Management 
•	Add employees.
•	Update salary.
•	Search employees.
•	Count total employees.
Test Cases
Test Case 1
Input: Add 5 employees.
Expected: employeeCount = 5
Test Case 2
Input: Increase Rahul's salary.
Expected: Only Rahul's salary changes.
Test Case 3
Input: Change company name. 
Expected: All employees display the n
Expected: All employees display the new company name.
*/

class Employee
{
	int empId;
	String name;
	String department;
	int salary;
	static String companyName = "ABC Company ";
	static int employeeCount = 0;
	
	Employee(int empId, String name, String department, int salary)
	{
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		employeeCount++;
	}

	public int getTotalEmpCount()
	{
		return employeeCount;
	}
	
	public void updateSalary(String salary)
	{
		this.salary = salary;
		System.out.println("The Salary is Changed");
	}
}
public class EmployeeManagementSystem
{
	public static void main(String x[])
	{
		Employee[] e = new Employee[1000];
		e[0] = new Employee(101,"Rahul","Development");
		e[1] = new Employee(102,"Sneha","Testing");
		e[2] = new Employee(103,"Pooja","HR");
		
		System.out.println("1. Get Total ");
		
	}
	
}
