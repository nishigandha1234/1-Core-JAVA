class Pattern55
{
	public static void main(String x[])
	{
		for(int i = 1 ; i<= 7 ; i++)
		{
			int num = i<=4 ? i : 8-i;
			for(int j = 1 ; j<=7 ; j++)
			{
				if(j >= 5-num && j<= 3+num)
				{
					System.out.print(num+" ");
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