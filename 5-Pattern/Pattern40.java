class Pattern40
{
	public static void main(String x[])
	{
		
		for(int i = 1 ; i <= 5 ; i++)
		{
			int num = 1;
			for(int j = 1 ; j <= 9 ; j++)
			{
				if(j >= 6-i && j <= 4+i)
				{
					System.out.print(num+" ");
					num= j>=5?--num:++num;
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