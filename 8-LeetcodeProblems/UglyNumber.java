import java.util.Scanner;

class UglyNumber
{
	public static void main(String x[])
	{
		System.out.println(isUgly(7));
	}
	public static boolean isUgly(int num)
	{
		if(num <= 0) return false;
		
		while(num % 2 == 0 )
		{
			num /= 2;
		}
		while(num % 3 == 0 )
		{
			num /= 3;
		}
		while(num % 5 == 0 )
		{
			num /= 5;
		}
		return num == 1;
	}
}