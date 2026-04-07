
class Q2FactorialOfNumber
{
	public static void main(String x[])
	{
		int n = 5;
		System.out.println(fact(n));
	}
	public static int fact(int n)
	{
		if(n == 1 || n == 0)
		{
			return n;
		}
		return n*fact(n-1);
	}
}