
class FibonacciUsingRecursion
{
	public static void main(String x[])
	{
		int limit = 10;
		for(int i = 0 ; i <= limit ; i++)
		{
			System.out.print(fibo(i) + " ");
		}
	}
	public static int fibo(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
}