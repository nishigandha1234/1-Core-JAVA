class Pattern18
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 5; i++)
		{
			for(int j = 1 ; j <=9 ; j++)
			{
				//j>= 6-i && j <= 4+i
				if(i ==5 || j>= 6-i )
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

