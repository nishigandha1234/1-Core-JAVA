
class Q1Print1ToN
{
	public static void main(String x[])
	{
		int limit = 5;
		for(int i = 1 ; i <= limit ; i++)
		{
			System.out.print(printNum(i)+" ");
		}
	}
	public static int printNum(int n)
	{
		if(n == 1)
		{
			return n;
		}
		return printNum(n-1)+1;
	}
}