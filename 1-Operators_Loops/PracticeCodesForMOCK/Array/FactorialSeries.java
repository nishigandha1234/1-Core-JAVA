class FactorialSeries
{
	public static void main(String x[])
	{
		int ans = fact(5);
		System.out.println(ans);
	}
	public static int fact(int num)
	{
		if(num != 1)
		{
			return num*fact(--num);
		}
		else
		{
			return num;
		}
	}
}