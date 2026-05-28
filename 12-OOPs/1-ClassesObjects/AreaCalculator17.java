/*Question 17: Write a Java program to implement an Area Calculator using Method Overloading.Create a class AreaCalculator and overload method area():
- area(int side) => Calculate area of square
- area(int length, int breadth) => Calculate area of rectangle
- area(int base, int height, int type) => Calculate area of triangle
Input: Enter side : 5 Enter length and breadth : 10 4 Enter base and height : 8 6
Output: Area of Square : 25 Area of Rectangle : 40 Area of Triangle : 24*/

import java.util.Scanner;
class AreaCalculator
{
	void area(int side)
	{
		System.out.println("Area of Square is : " + (side*side));
	}
	void area(int length, int breadth)
	{
		System.out.println("Area of Rectangle is : " + (length*breadth));
	}
	void area(int base, int height, int type)
	{
		System.out.println("Addition of Triangle : " + (0.5*base*height));
	}
}
public class AreaCalculator17
{
	public static void main(String x[])
	{
		AreaCalculator s1 = new AreaCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side : ");
		int side = sc.nextInt();
		System.out.println("Enter Length : ");
		int length = sc.nextInt();
		System.out.println("Enter Breadth : ");
		int breadth = sc.nextInt();
		System.out.println("Enter base : ");
		int base = sc.nextInt();
		System.out.println("Enter height : ");
		int height = sc.nextInt();
		s1.area(side);
		s1.area(length, breadth);
		s1.area(base, height, 0);
	}
}