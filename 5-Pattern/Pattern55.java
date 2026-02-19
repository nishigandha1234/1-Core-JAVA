class Pattern55
{
	public static void main(String x[])
	{
		int num=1;
		for(int i = 1 ; i<=7; i++)
		{
			int r = (i <= 4) ? i : 8-i;
			num=1;
			for(int j = 1 ; j<=8 ; j++)
			{
				if(j>=6-r && j<=4+r)
				{
					System.out.print(num+" ");
					num=j>=5?--num:++num;	
				}
				else if(j<=6-r && j>=4+r)
				{
					System.out.print(num+" ");
					num=j>5?++num:--num;	
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