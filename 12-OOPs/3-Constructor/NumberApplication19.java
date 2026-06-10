/*Question 19: Write a Java program to find second highest number from Number objects.
Description: Create Number class with value field. Store numbers using constructor and find second maximum value.
INPUT:
10 40 25 90 60
OUTPUT:
Second Highest Number: 60*/

class Number
{
	private int value;
	
	Number(int value)
	{
		this.value = value;
	}
	public void setValue(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}
public class NumberApplication19
{
	public static void main(String x[])
	{
		Number n[] = new Number[5];
		n[0] = new Number(10);
		n[1] = new Number(40);
		n[2] = new Number(25);
		n[3] = new Number(90);
		n[4] = new Number(60);
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i].getValue() > max)
			{
				secondMax = max;
				max = n[i].getValue();
			}
			else if(n[i].getValue() > secondMax && n[i].getValue() != max)
			{
				secondMax = n[i].getValue();
			}
		}
		System.out.println("Second Highest Number : " + secondMax);
	}
}
