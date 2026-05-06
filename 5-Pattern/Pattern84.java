class Pattern84
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 7 ; i++)
		{
			char ch = 'D';
		
			for(int j = 1 ; j <= 4 ; j++)
			{
				if( (i >= j && i <= 4) || (j <= 8-i && i > 4))
				{
					System.out.print(ch--+" ");
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