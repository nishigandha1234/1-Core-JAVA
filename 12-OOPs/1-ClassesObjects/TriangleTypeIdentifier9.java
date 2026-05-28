/*Question 9: Write a Java program to implement a Triangle Type Identifier.
Create a class Triangle with attributes side1, side2, side3.Identify triangle type:- All sides equal => Equilateral  Two sides equal => Isosceles  All sides different => Scalene
Input: Enter Side1 : 5 Enter Side2 : 5 Enter Side3 : 5 
Output: Triangle Type : Equilateral Triangle*/

import java.util.Scanner;
class Triangle
{
	Scanner sc = new Scanner(System.in);
	int side1 = sc.nextInt();
	int side2 = sc.nextInt();
	int side3 = sc.nextInt();
	
	void typeOfTriangle()
	{
		if(side1 == side2 && side1 == side3 && side2 == side3)
		{
			System.out.println("This is Equilateral Triangle");
		}
		else if(side1 == side2 && side2 == side3 ||  side2 == side3 && side1 == side3)
		{
			System.out.println("This is Isosceles Triangle");
		}
		else
		{
			System.out.println("This is Scalene Triangle");
		}
	}
}
public class TriangleTypeIdentifier9
{
	public static void main(String x[])
	{
		Triangle t1 = new Triangle();
		t1.typeOfTriangle();
	}
}