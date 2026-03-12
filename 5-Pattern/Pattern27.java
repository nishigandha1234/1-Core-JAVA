class Pattern27
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 6 ; i++)
		{
			for(int j = 1 ; j <= 3 ; j++)
			{
				if((j <= i && i<=3) || (j<=i-3 && i>=4))
					System.out.print("* ");
				else
					System.out.print("  ");
			}			
			System.out.println();
		}
	}
}