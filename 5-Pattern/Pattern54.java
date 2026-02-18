class Pattern54
{
	public static void main(String x[])
	{
		int num = 1;
		int flag = 1;
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				if(flag == 1 && (j <= 6-i && j >= 4+i && i==5))
			
					System.out.print(i+ " ");
					flag = 0;
				else
					System.out.print(" "+" ");
					flag = 1;
			}
			System.out.println();
		}
	}
}