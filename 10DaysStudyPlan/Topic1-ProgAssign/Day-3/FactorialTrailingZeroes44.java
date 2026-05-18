/*44. Function to calculate factorial 
172. Factorial Trailing Zeroes
Given an integer n, return the number of trailing zeroes in n!.
Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.*/


class FactorialTrailingZeroes44
{
	public static void main(String x[])
	{
		int n = 7;
		System.out.println(countTrailingZeros(n));
	}
	public static int countTrailingZeros(int n)
	{
		int fact = 1;
		for(int i = 1 ; i <= n ; i++) //1<5
		{
			fact *= i; //5
		}
		int temp = fact;
		int count = 0;
		while(temp != 0)
		{
			int rem = temp % 10;
			if(rem == 0)
			{
				count++;
			}
			temp/=10;
		}
		return count;
	}
}