
class SumOfNaturalNum
{
	public static void main(String x[])
	{
		int limit = 4;
		System.out.println(sum(limit));
	}
	public static int sum(int n)
	{
		if(n <= 1)
			return n;
			
		return n+sum(n-1);
	}
}