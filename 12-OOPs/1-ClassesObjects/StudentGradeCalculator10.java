/*Question 10: Write a Java program to implement a Student Grade Calculator.Create a class StudentGrade with attributes name and marks.Calculate grade based on marks:- 80 to 100 => Grade A - 60 to 79 => Grade B - 40 to 59 => Grade C - Below 40 => Fail
Input: Enter Name : Priya Enter Marks : 67
Output:Name : Priya Marks : 67 Grade : B*/


import java.util.Scanner;
class Student
{
	String name;
	int marks;
	
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
	}
	void calculateGrade()
	{
		System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
		
		if(marks >= 80 && marks <= 100)
			System.out.println("Grade : A");
		else if(marks >= 60 && marks <= 79)
			System.out.println("Grade : B");
		else if(marks >= 40 && marks <= 59)
			System.out.println("Grade : C");
		else 
			System.out.println("Grade : Fail...!!!");
	}
}
public class StudentGradeCalculator10
{
	public static void main(String x[])
	{
		Student s1 = new Student();
		s1.setValue();
		s1.calculateGrade();
	}
}