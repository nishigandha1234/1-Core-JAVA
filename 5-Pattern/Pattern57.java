class Pattern57
{
	public static void main(String x[])
	{
		int flag = 1;
		for(int i = 1;i<=5 ; i++)
		{
			int n = 1;
			for(int j = 1 ; j<=9; j++)
			{
				if(flag == 1 && j == (6-i) || j == 4+i)
				{
					System.out.print("1" +" ");
					flag = 0;
				}
				else if(flag == 1 && i==5)
				{
					System.out.print(++n +" ");
					flag = 0;
				}
				else
				{
					System.out.print("  ");
					flag = 1;
				}
			}
			System.out.println();
		}
	}
}