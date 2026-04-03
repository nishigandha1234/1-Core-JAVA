
class Q8Power
{
	public static void main(String x[])
	{
		int base = 6, index = 6;
		power(base, index);
	}
	public static void power(int base, int index)
	{
		int pow = 1;
		
		for(int i = 1 ; i <= index ; i++)
		{
			pow *= base;
		}
		System.out.println(pow);
	}
}