class Pattern34
{
	public static void main(String x[])
	{
		int ch = 1;
		for(int i = 1 ; i<=5; i++)
		{
			for(int j = 1 ; j<=5 ; j++)
			{
				if(i >= j)
					System.out.print(ch++ + " ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}	
}