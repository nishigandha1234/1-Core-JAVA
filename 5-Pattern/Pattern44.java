class Pattern44
{
	public static void main(String x[])
	{
		int num =1;
		int flag = 1;
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				if(flag == 1)
				{
					System.out.print("#  "); 
					flag = 0;
					
				}
				else 
				{
					System.out.print(num++ + "  ");
					flag = 1;
				}
			}
			System.out.println();
		}
	}
}