class Pattern1To9
{
	public static void main(String x[])
	{
		 
		for(int i = 5 ; i >= 1 ; i--)
		{
			int n =1 ;
			for(int j = 9 ; j >= 1 ; j--)
			{
				int n1 = n;
				if(j>= 6-i && j <= 4+i)
				{
					System.out.print(n++ + " ");
	
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