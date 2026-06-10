/*Question 16: Write a Java program to delete a student record from an array using constructor objects.
Description: Create Student class with rollNo, name and percentage. Store student objects. Accept roll number to delete and remove that record (shift array).
INPUT: Students: 1 Ravi 70 2 Kiran 65 3 Om 80
Enter roll to delete: 2
OUTPUT: Remaining Students: 1 Ravi 70 3 Om 80*/

import java.util.Scanner;
class Student
{
	private int rollNo;
	private String name;
	private int percentage;

	Student(int rollNo, String name, int percentage)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setPercentage(int percentage)
	{
		this.percentage = percentage;
	}
	public int getPercentage()
	{
		return percentage;
	}
}
public class StudentApplication16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Student p1 = new Student(1, "Ravi", 70);
		Student p2 = new Student(2, "Kiran", 65);
		Student p3 = new Student(3, "Om", 80);
		System.out.println("Enter roll to delete Record : " );
		int choice = sc.nextInt();
		if(choice == 1)
		{
			p1.setRollNo(0);
			p1.setName(null);
			p1.setPercentage(0);
			System.out.println("Remaining Students : "+p2.getRollNo()+" "+p2.getName()+" "+p2.getPercentage()+" "+p3.getRollNo()+" "+p3.getName()+" "+p3.getPercentage());
		}
		else if(choice == 2)
		{
			p2.setRollNo(0);
			p2.setName(null);
			p2.setPercentage(0);
			System.out.println("Remaining Students : "+p1.getRollNo()+" "+p1.getName()+" "+p1.getPercentage()+" "+p3.getRollNo()+" "+p3.getName()+" "+p3.getPercentage());
		}
		else if(choice == 3)
		{
			p3.setRollNo(0);
			p3.setName(null);
			p3.setPercentage(0);
			System.out.println("Remaining Students : "+p1.getRollNo()+" "+p1.getName()+" "+p1.getPercentage()+" "+p2.getRollNo()+" "+p2.getName()+" "+p2.getPercentage());
		}
		else 
			System.out.println("ENTERED INVALID CHOICE");
	}
}
