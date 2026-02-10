class Pattern14
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 14 ; i++)
		{
			for(int j = 1 ; j <=7; j++)
			{
				if((j <= 8-i && i <= 7) || (j >= 16-i && i >=8)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}