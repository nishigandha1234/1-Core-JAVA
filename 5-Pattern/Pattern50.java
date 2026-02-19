class Pattern50
{
	public static void main(String x[])
	{
	for(int i = 1 ; i <= 7 ; i++)
	{
		for(int j = 1 ; j <= 4 ; j++)
		{
			if(j >= 5-i && j<= 3+i)
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