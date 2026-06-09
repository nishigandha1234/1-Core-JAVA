/*Question 7: Write a Java program to check whether a number is even or odd using constructor initialization.
Description: Create NumberCheck class with one integer variable. Initialize using constructor and check even or odd using logical condition.
INPUT: Enter Number: 17
OUTPUT: 17 is Odd Number*/

class NumberCheck
{
	private int num;

	NumberCheck(int num)
	{
		this.num = num;
	}
	public void setNum(int num)
	{
		this.num = num;
	}	
	public int getNum()
	{
		return num;
	}
	public String getEvenOdd()
	{
		if(this.num % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
}
public class NumberCheckApplication 
{
	public static void main(String x[])
	{
		NumberCheck num = new NumberCheck(17);
        System.out.println( num.getNum() + " : is " + num.getEvenOdd() + " Number ");
	}
}