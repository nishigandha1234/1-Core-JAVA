class Pattern33
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			int n = i;
			for(int j = 1; j <= 5 ; j++)
			{
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}