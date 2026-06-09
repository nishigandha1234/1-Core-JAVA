/*Question 9: Write a Java program to calculate average of three subject marks using constructor.
Description: Create Result class with three subject marks. Initialize using constructor. Calculate average and display result.
INPUT:
Enter Marks: 70 80 90
OUTPUT:
Average Marks: 80*/

class Result
{
	private int m1, m2, m3;

	Result(int m1, int m2, int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public void setM1(int m1)
	{
		this.m1 = m1;
	}	
	public int getM1()
	{
		return m1;
	}
	public void setM2(int m2)
	{
		this.m2 = m2;
	}	
	public int getM2()
	{
		return m2;
	}
	public void setM3(int m3)
	{
		this.m3 = m3;
	}	
	public int getM3()
	{
		return m3;
	}
	public int getAverage()
	{
		int sum = m1+m2+m3;
		return sum/3;
	}
}
public class ResultApplication 
{
	public static void main(String x[])
	{
		Result res = new Result(70,80,90);
		System.out.println("Average Marks : " + res.getAverage());
	}
}