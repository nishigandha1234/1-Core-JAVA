class Pattern53
{
	public static void main(String x[])
	{
		int num = 1;
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j<=5 ; j++)
			{
				if(i==1 || j ==1 || j == 6 -i)
				{
					System.out.print(num++ + " ");
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