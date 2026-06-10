/*Question 18: Write a Java program to count how many employees salary is above average.
Description: Create Employee class with id, name and salary. Calculate average salary then count employees having salary greater than average.
INPUT: 1 Ram 20000 2 Shyam 30000 3 Mohan 25000 4 Sita 35000
OUTPUT: Average Salary: 27500 Employees above average: 2*/

class Employee
{
	private int id;
	private String name;
	private int salary;

	Employee(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
}
public class EmployeeApplication18
{
	public static void main(String x[])
	{
		Employee p1 = new Employee(1, "Ram ", 20000);
		Employee p2 = new Employee(2, "Shyam",30000);
		Employee p3 = new Employee(3, "Mohan", 25000);
		Employee p4 = new Employee(4, "Sita", 35000);
		
		int avg = (p1.getSalary() + p2.getSalary() +p3.getSalary()+p4.getSalary()) / 4;
		
		int count = 0;
		if(p1.getSalary() > avg)
			count++;
		if(p2.getSalary() > avg)
			count++;
		if(p3.getSalary() > avg)
			count++;
		if(p4.getSalary() > avg)
			count++;
		System.out.println("Average Salary : " + avg);
		System.out.println("Employees above average : " + count);
	}
}
