class 	FibonacciSeries
{
	public static void main(String x[])
	{
		int n = 10;
		for(int i = 0 ; i <= n ; i++)
		{
			System.out.print(fibo(i) + " ");
		}
	}
	public static int fibo(int n)
	{
		if(n == 0) return 0;
		if(n == 1) return 1;
		int a = 0, b = 1 , c = 0 ;
		for(int i = 2 ; i <= n ; i++)
		{
			c = a + b;
			a = b ; 
			b = c;
		}
		return c;
	}
}
