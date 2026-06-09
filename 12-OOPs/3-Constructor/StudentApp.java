/*Question 1: Write a Java program to create a Student POJO class with fields rollNo, name and marks. Use a parameterized constructor to initialize values and display student details.
Description: Create a Student class having private data members rollNo, name and marks. Initialize values using a constructor and display details using an object. Demonstrate object initialization using constructor.
INPUT: Enter Roll No: 101 Enter Name: Rahul Enter Marks: 78
OUTPUT: Student Details: Roll No: 101 Name: Rahul Marks: 78*/

class Student
{
	private int rollNo;
	private String name;
	private int marks;
	
	Student(int rollNo, String name, int marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
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
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public int getMarks()
	{
		return marks;
	}
}
public class StudentApp
{
	public static void main(String x[])
	{
		Student s = new Student(101 , "ram", 80 );
		System.out.println("Student Details :");
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
	}
}