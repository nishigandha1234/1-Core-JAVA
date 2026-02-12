class Pattern28
{
	public static void main(String[] args)
	{
		int flag = 1;
		for(int i = 1 ; i <= 9 ; i++)
		{
			for(int j = 1 ; j <= 9 ; j++)
			{
				if((flag==1)&&(j>=6-i&&j<=4+i)&&(i<=5) || (flag==1)&&(j>=i-4&&)&&(i>=6))
				{
					System.out.print("* "+" ");
					flag = 0;
				}
				else
				{
					System.out.print("  "+" ");
					flag = 1;
				}
			}
			System.out.println();
		}
	}
}