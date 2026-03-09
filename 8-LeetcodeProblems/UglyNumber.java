import java.util.Scanner;

class UglyNumber
{
	public static void main(String x[])
	{
		isUgly(30);
	}
	public static void isUgly(int num)
	{
		if(num%2==0 || num%3==0 || num%5==0)
		{
			System.out.println("Ugly Number");
		}
		else
		{
			System.out.println("NOT Ugly Number");
		}
	}
}