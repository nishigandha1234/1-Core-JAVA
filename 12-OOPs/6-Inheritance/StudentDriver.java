/*Question 3: Create a base class Student with attributes name and rollNo.
Create a child class Result that includes marks of 3 subjects.
Calculate total and percentage.This assignment demonstrates inheritance with calculation logic.The child class uses parent data and extends it to compute academic results.
Input Enter Name: Amit Enter Roll No: 101 Enter Marks1: 80 Enter Marks2: 70 Enter Marks3: 90
Output Name: Amit Roll No: 101 Total Marks: 240 Percentage: 80.0%*/

import java.util.Scanner;
class Student
{
	String name;
	int rollNo;
	
	void acceptStudent()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Roll No : ");
		rollNo = sc.nextInt();
	}
	void displayStudent()
	{
		System.out.println("Enter Name : "+name);
		System.out.println("Enter roll No : "+rollNo);	
	}
}
class Result extends Student
{
	int m1;
	int m2;
	int m3;
	
	void acceptMarks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks 1 : ");
		m1 = sc.nextInt();
		System.out.println("Enter Marks 2 : ");
		m2 = sc.nextInt();
		System.out.println("Enter Marks 3 : ");
		m3 = sc.nextInt();
	}
	void calculateMarks()
	{
		int total = m1+m2+m3;
		System.out.println("Total Marks : "+total);
		int percentage = total / 3;
		System.out.println("Percentage : "+percentage);
	}
}
public class StudentDriver
{
	public static void main(String x[])
	{
		Result r = new Result();
		r.acceptStudent();
		r.acceptMarks();
		r.displayStudent();
		r.calculateMarks();
	}
}