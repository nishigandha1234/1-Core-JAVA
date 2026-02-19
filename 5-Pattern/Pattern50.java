class Pattern50
{
	public static void main(String x[])
	{
	for(int i = 1 ; i <= 4 ; i++)
	{
		for(int j = 4 ; j >= 1 ; j--)
		{
			if(j >= 5-i)
			{
				System.out.print(i+" ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	}
}