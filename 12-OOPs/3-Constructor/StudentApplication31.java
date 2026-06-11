/*Question 31: Write a Java program to create a Student Course Allocation system.
Description: Create Student class with studentId, name and courseName. Initialize using constructor. Store 5 students. Display students enrolled in a specific course entered by user.
INPUT: 1 Amit Java 2 Neha Python 3 Raj Java 4 Kiran SQL 5 Pooja Java
Enter Course to search: Java
OUTPUT: Students enrolled in Java: Amit Raj Pooja
EXPLANATION: Create Student class with fields studentId, name, courseName. Use constructor to initialize. Store 5 students in array. Accept course name from user. Loop through array, if student courseName matches input, display student name. Display all students enrolled in Java course.*/

import java.util.*;
class Student
{
	private int studentId;
	private String name;
	private String courseName;

	Student(int studentId,String name,String courseName)
	{
		this.name = name;
		this.studentId = studentId;
		this.courseName = courseName;
	}
	public void setstudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public int getstudentId()
	{
		return studentId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setcourseName(String courseName)
	{
		this.courseName = courseName;
	}
	public String getcourseName()
	{
		return courseName;
	}
}
public class StudentApplication31
{
	public static void main(String x[])
	{
		Student[] n = new Student[5];
		n[0] = new Student(1, "Amit", "Java");
		n[1] = new Student(1, "Neha", "Python");
		n[2] = new Student(1, "Raj", "Java");
		n[3] = new Student(1, "Kiran", "SQL");
		n[4] = new Student(1, "Pooja", "Java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course to search:");
		String input = sc.next();
		
		for(int i = 0; i < n.length; i++)
		{
			if(input.equals(n[i].getcourseName()))
			{
				System.out.println("Students enrolled in "+ n[i].getcourseName()+" : "+ n[i].getName());
			}
		}
	}
}
