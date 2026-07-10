/*Question 48: Create abstract class Student to calculate grades.
Abstract method calculateGrade().Subclasses:SchoolStudent CollegeStudentGrade based on marks.
Input Type: School Marks: 85
Output Grade: A*/

import java.util.Scanner;
abstract class Student
{
	abstract void calculateGrade();
} 
class SchoolStudent extends Student
{ 
	int marks;
	
	SchoolStudent(int marks)
	{
		this.marks = marks;
	}
	public void calculateGrade()
	{
		String grade;
		if(marks >= 100 && marks <= 75)
			grade = "A";
		else if(marks > 75 && marks <= 55)
			grade = "B";
		else if(marks > 55 && marks <= 35)
			grade = "C";
		else 
			grade = "Pass";
		System.out.println("Grade : "+grade);
	}
}
class CollegeStudentGrade extends Student
{
	int marks;
	
	CollegeStudentGrade(int marks)
	{
		this.marks = marks;
	}
	public void calculateGrade()
	{
		String grade;
		if(marks >= 100 && marks <= 75)
			grade = "A";
		else if(marks > 75 && marks <= 55)
			grade = "B";
		else if(marks > 55 && marks <= 35)
			grade = "C";
		else 
			grade = "Pass";
		System.out.println("Grade
		System.out.println("Grade : "+grade);
	}
}
public class StudentDriver
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Type (SchoolStudent/CollegeStudentGrade) : ");
		String type = sc.next();
		
		sc.nextLine();       
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		Student s;
		
		if(type.equalsIgnoreCase("SchoolStudent"))
        {
            s = new SchoolStudent(marks);
        }
        else
        {
            s = new CollegeStudentGrade(marks);
        }

        s.calculateGrade();
	}
}