
class Q9StrongNumber
{
	public static void main(String x[])
	{
		int num = 145;
		strongNumber(num);
	}
	public static void strongNumber(int num)
	{
		int temp = num;
		int sum = 0;
		while(temp != 0 )
		{
			int rem = temp % 10;
			int fact =1 ;
			for(int i = 1 ; i <= rem ; i++)
			{
				fact *= i;
			}
			sum += fact;
			temp /= 10;
		}
		if(sum == num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("NOT Strong Number");
		}
	}
}