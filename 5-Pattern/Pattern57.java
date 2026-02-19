class Pattern57
{
	public static void main(String x[])
	{
		for(int i = 1;i<=5 ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				if(i==5)
				{
					System.out.print(i+" ");
				}
				else if(j>=6-i && j <= 3 +i)
				{
					System.out.print("1"+" ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}