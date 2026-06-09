/*Question 2: Write a Java program to create an Employee class and calculate yearly salary using constructor.Description: Create Employee class with empId, empName and monthlySalary. Use constructor to initialize values. Calculate yearly salary (monthlySalary × 12) and display it.
INPUT: Enter Employee Id: 201 Enter Employee Name: Amit Enter Monthly Salary: 25000
OUTPUT: Employee Name: Amit Yearly Salary: 300000*/

class Employee
{
	private int empId;
	private String empName;
	private int monthlySalary;
	
	Employee(int empId, String empName, int monthlySalary)
	{
		this.empId = empId;
		this.empName = empName;
		this.monthlySalary = monthlySalary;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setMonthlySal(int monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	public int getMonthlySal()
	{
		return monthlySalary;
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Employee emp = new Employee(10, "Rahul", 25000);
        System.out.println("Employee Name : " + (emp.getEmpName()) + "  Yearly Salary : " + (emp.getMonthlySal()*12));
	}
}