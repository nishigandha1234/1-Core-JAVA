class Pattern52
{
	public static void main(String x[])
	{
		for(int i = 1 ; i<= 5 ; i++)
		{
			for(int j =1 ; j<= 5 ; j++)
			{
				if(i == j || j == 6-i)
				{
					System.out.print("1 "+" ");
				}
				else
				{
					System.out.print("0 "+ " ");
				}
			}
			System.out.println();
		}
	}
}