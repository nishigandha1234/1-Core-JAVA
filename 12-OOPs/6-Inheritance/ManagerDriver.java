/*Question 1: Create a base class Employee with attributes name and salary. Create a child class Manager that adds bonus. Calculate total salary using inheritance. This program demonstrates single inheritance where Manager inherits from Employee. The child class extends functionality by adding a bonus and calculating total salary.Input : Enter Name: RahuEnter Salary: 5000Enter Bonus: 10000
Output :Employee Name: Rahul Base Salary: 50000 Bonus: 10000 Total Salary: 60000*/
import java.util.Scanner;

class Employee
{
	String name;
	int salary;
	
	void acceptEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Employee : ");
		name = sc.next();
		
		System.out.println("Enter the Salary of Employee : ");
		salary = sc.nextInt();	
	}
	void displayEmployee()
	{
		System.out.println("Name : "+name);		
		System.out.println("Salary : "+salary);		
	}
}
class Manager extends Employee
{
	int bonus;
	
	void acceptBonus()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bonus : ");
		bonus = sc.nextInt();
	}
	void calculateSalary()
	{
		int total = salary+bonus;
		
		displayEmployee();
		System.out.println("Bonus of Employee : "+bonus);
		System.out.println("Total Salary of Employee : "+total);
	}
}
public class ManagerDriver
{
	public static void main(String x[])
	{
		Manager m = new Manager();
		m.acceptEmployee();
		m.acceptBonus();
		m.calculateSalary();
	}
}