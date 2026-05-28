/*Question 11: Write a Java program to implement an Employee Bonus System.Create a class Employee with attributes empId, name, salary, and yearsOfExperience.
Calculate bonus:- Experience > 10 years => 20% bonus - Experience 5 to 10 years => 10% bonus - Experience < 5 years => 5% bonus. Display total salary after bonus.
Input: Enter Employee Id : 501 Enter Name : Anil Enter Salary : 40000 Enter Experience : 8
Output:Employee Id : 501 Name : Anil Salary : 40000 Bonus : 4000 Total Salary : 44000*/

import java.util.Scanner;
class Employee
{
	int empId;
	String name;
	int salary;
	int experience;
	
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		empId = sc.nextInt();
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter salary : ");
		salary = sc.nextInt();
		System.out.println("Enter Experience : ");
		experience = sc.nextInt();
	}
	void calculateBonus()
	{
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		int newSalary = 0, ogSalary = 0;
		
		if(experience > 10)
		{
			ogSalary =   (20*salary) / 100;
			System.out.println("Bonus : " + ogSalary);
			newSalary = salary + ogSalary;
			System.out.println("Total Salary : " + newSalary);
        
		}
		else if(experience >= 5 && experience <= 10)
		{
			ogSalary =  (10*salary) / 100;
			System.out.println("Bonus : " + ogSalary);
			newSalary = salary + ogSalary;
			System.out.println("Total Salary : " + newSalary);
        
		}
		else if(experience < 5)
		{
			ogSalary =  (5*salary) / 100;
			System.out.println("Bonus : " + ogSalary);
			newSalary = salary + ogSalary;
			System.out.println("Total Salary : " + newSalary);
		}
	}
}
public class EmployeeBonusSystem11
{
	public static void main(String x[])
	{
		Employee s1 = new Employee();
		s1.setValue();
		s1.calculateBonus();
	}
}