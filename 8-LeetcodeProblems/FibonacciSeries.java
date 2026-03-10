//509. Fibonacci Number

class FibonacciSeries
{
	public static void main(String x[])
	{
		System.out.println(fibo(10));
	}
	public static int fibo(int num)
	{
		if(num == 0)
			return 0;
		if(num == 1)
			return 1;
		
		int a=0 , b=1 , c=0;
		
		for(int i = 2 ; i <= num ; i++)
		{
			c = a+b;
			a = b;
			b = c;
		}
		return c ;
	}
}