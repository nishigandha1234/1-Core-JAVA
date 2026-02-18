class Pattern47
{
	public static void main(String x[])
	{
		
		int flag = 1;
		for(int i = 1 ; i <= 9 ; i++)
		{
			int num =1 ;
			for(int j =1 ; j <= 9 ; j++)
			{
				if(flag == 1 && (j>=6-i && j <= 4+i && i<=5 ))
				{
					System.out.print(num++ +"   ");
					flag = 0;
				}
				else if(flag == 1 && (j>= i-4 && j <= 14-i && i >=6))
				{
					System.out.print(num++ + "   ");
					flag = 0;
				}
				else
				{
					System.out.print("   ");
					flag = 1;
				}
			}
			System.out.println();
		}
	}
}