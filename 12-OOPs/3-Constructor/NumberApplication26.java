/*Question 26: Write a Java program to count even numbers stored in object array.
Description: Create Number class storing integer. Count even numbers.
INPUT: 10 15 22 33 40 OUTPUT: Even Numbers Count: 3
EXPLANATION:Create Number class with field value. Store 5 numbers in array using constructor: 10, 15, 22, 33, 40. Loop through array, check if value % 2 == 0 (even). Count: 10 (even), 22 (even), 40 (even) = 3 even numbers. Display count.*/

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
public class NumberApplication26
{
	public static void main(String x[])
	{
		Number[] n = new Number[5];

		n[0] = new Number(10);
		n[1] = new Number(15);
		n[2] = new Number(22);
		n[3] = new Number(33);
		n[4] = new Number(40);
		
		int count = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i].getValue() % 2 == 0)
				count++;
		}
		System.out.println("Even Numbers Count : " + count);
	}
}
