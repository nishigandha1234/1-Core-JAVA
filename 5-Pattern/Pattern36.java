class Pattern36
{
	public static void main(String x[])
	{
		int n1 = 1;
		for(int i =1 ; i<=5 ; i++)
		{
			int flag =1;
			
			int n = n1;
			for(int j = 1 ; j <= 9 ; j++)
			{
				
				if(flag == 1 && j >= (6-i) && j<= 4+i)
				{
					System.out.print(n++ +" ");
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
