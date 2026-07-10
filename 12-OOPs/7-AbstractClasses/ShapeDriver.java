/*Question 43: Create an abstract class Shape to calculate area of different shapes. Create abstract class Shape with: Abstract method calculateArea() Create subclasses: Circle ? area = ? × r × r Rectangle ? area = length × width Program should take input and calculate respective area. 
Input Shape: Circle Radius: 5
Output Area of Circle: 78.5*/

abstract class Shape
{
	abstract void calculateArea();
} 
class Circle extends Shape
{
	static double pi = 3.14;
	double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	public void calculateArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area of Circle : "+ area);
	}
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void calculateArea()
	{
		int area = length * breadth;
		System.out.println("Reactangle Area  : "+area);
	}
}
public class ShapeDriver
{
	public static void main(String x[])
	{
		Shape s1 = new Circle(12.0);
		s1.calculateArea();
		System.out.println();
		s1 = new Rectangle(10, 20);
		s1.calculateArea();
	}
}