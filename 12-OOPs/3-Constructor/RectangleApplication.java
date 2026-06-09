/*Question 5: Write a Java program to create a Rectangle class and calculate area using constructor.
Description: Create Rectangle class with length and width. Initialize values using constructor and calculate area using formula length × width.
INPUT: Enter Length: 10 Enter Width: 5
OUTPUT: Area of Rectangle is: 50*/

class Rectangle
{
	private int length;
	private int width;

	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public int getLength()
	{
		return length;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public int getWidth()
	{
		return width;
	}
	public int getAreaOfRectangle()
	{
		return length*width;
	}
}
public class RectangleApplication
{
	public static void main(String x[])
	{
		Rectangle rec = new Rectangle(10, 5);
        System.out.println("Area of Rectangle is: " + rec.getAreaOfRectangle());
	}
}