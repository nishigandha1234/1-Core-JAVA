/*Question 29: Write a Java program to calculate grade of students.
Description: Create Student class with marks. Assign grade: ?75 ? Distinction, ?60 ? First Class, ?50 ? Second Class, else Pass.
INPUT: Amit 78 Raj 61 Neha 48
OUTPUT: Amit Distinction Raj First Class Neha Pass
EXPLANATION : Create Student class with fields name and marks. Use constructor to initialize. Store 3 students. Create method to assign grade based on marks: if marks>=75 "Distinction", else if marks>=60 "First Class", else if marks>=50 "Second Class", else "Pass". Display each student with grade.*/

class Student
{
	private String name;
	private int marks;
	
	Student(String name,int marks)
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
public class StudentApplication29
{
	public static void main(String x[])
	{
		Student[] n = new Student[3];

		n[0] = new Student("Amit", 78);
		n[1] = new Student("Raj", 61);
		n[2] = new Student("Neha", 48);
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i].getMarks() >= 75)
				System.out.println(n[i].getName() + " Distinction");
			else if(n[i].getMarks() >= 60)
				System.out.println(n[i].getName() + " First Class");
			else if(n[i].getMarks() >= 50)
				System.out.println(n[i].getName() + " Second Class");
			else
				System.out.println(n[i].getName() + " Pass");
		}
	}
}
