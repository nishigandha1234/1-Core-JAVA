class Pattern39
{
	public static void main(String x[])
	{
		for(int i = 5 ; i >= 1 ; i--)
		{
			for(int j = 5 ; j >= 1 ; j--)
			{
				if(j>=6-i)
				{
					if(j==1 || j ==3 || j ==5)
						System.out.print(i+" ");
					else
						System.out.print("*"+" ");
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