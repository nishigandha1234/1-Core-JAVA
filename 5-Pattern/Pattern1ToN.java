class Pattern1ToN
{
	public static void main(String x[])
	{
		 
		for(int i = 0 ; i <= 5 ; i++)
		{
			int flag = 1 ;
			int n =1 ;
			for(int j = 0 ; j <= 9 ; j++)
			{
				int n1 = n;
				if(flag ==1 && j>= 6-i && j <= 4+i)
				{
					System.out.print(n++ + " ");
					flag = 0;
				}
				else
				{
					System.out.print("  ");
					flag =1;
				}
			}
			System.out.println();
		}
	}
}