class PatternNo18
{
	public static void main(String x[])
	{
		int flag = 1;
		for(int i = 5 ; i >= 1 ; i--)
		{
			for(int j = 9 ; j >= 1 ; j--)
			{
				if(flag == 1 && j >= 6-i && j <= 4+i)
				{
					System.out.print("*"+" ");
					flag = 0 ;
				}
				else
				{	
					System.out.print(" "+" ");
					flag = 1;
				}
			}
			System.out.println();
		}
	}
}