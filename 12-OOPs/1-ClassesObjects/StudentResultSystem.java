/*Question 1: Write a Java program to implement a Student Result System.
Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Input: Enter Student Id : 101 Enter Student Name : Rahul Enter Marks : 72
Output: Student Id : 101 Student Name : Rahul Marks : 72 Result : Pass*/

class Student{
	
	private int stdId = 101;
	private String stdName = "Rahul";
	private double marks = 72.0;
	
	void showStudentData()
	{
		System.out.println("Student ID is : "+stdId);
		System.out.println("Student Name is : "+stdName);
		System.out.println("Student marks is : "+marks);
		
		if(marks >= 35)
			System.out.println("Result is Pass");
		else
			System.out.println("Result is Fail");
	}
}
public class StudentResultSystem
{
	public static void main(String x[])
	{
		Student s1 = new Student();
		s1.showStudentData();		
	}
}
