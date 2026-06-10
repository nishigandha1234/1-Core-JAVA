/*Question 21: Write a Java program to count passing students.
Description: Create Student class with name and marks. Store students. Count students having marks?40.
INPUT: Amit 35 Raj 67 Neha 90 Pooja 25
OUTPUT: Passing Students: 2*/

import java.util.*;
class Student
{
	private String name;
	private int marks;
	
	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public int getMarks()
	{
		return marks;
	}
}
public class StudentApplication21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Student p1 = new Student("Amit", 35);
		Student p2 = new Student("Raj", 67);
		Student p3 = new Student("Neha", 90);
		Student p4 = new Student("Pooja", 25);
	
		int count = 0;

		if(p1.getMarks() > 40)
			count++;
		
		if(p2.getMarks() > 40)
			count++;
		
		if(p3.getMarks() > 40)
			count++;
		
		if(p4.getMarks() > 40)
			count++;
		
		System.out.println("Passing Students : " + count);
	}
}
