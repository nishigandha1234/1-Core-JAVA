class Pattern59
{
	public static void main(String x[])
	{
		for(int i = 1 ; i<= 5 ; i++)
		{
			int num=i;
			for(int j = 1 ; j <= 10 ; j++)
			{
				if(j<=i)
				{
				   System.out.print(j+" ");
				}
				else if(j>=11-i)
				{
				   System.out.print(num-- +" ");
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