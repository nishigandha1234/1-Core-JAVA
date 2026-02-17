class Pattern37
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			int num = 1;
			for(int j = 1 ; j <= 9 ; j++)
			{
				if(j <= 10-i && j >= i)
				{
					System.out.print(num++ +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}