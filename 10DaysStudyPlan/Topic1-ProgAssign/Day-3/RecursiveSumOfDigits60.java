/* 60 Recursive sum of digits */

class RecursiveSumOfDigits60
{
	public static void main(String x[])
	{
		int n = 123;
		System.out.println(sumOfDigits(n));
	}
	public static int sumOfDigits(int n)
	{
		if(n == 0)
			return 0;
		return n%10 + sumOfDigits(n/10);
	}
}