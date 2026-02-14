class Pattern35
{
	public static void main(String x[])
	{
		for(int i=1 ; i<= 5 ; i++)
		{
			int n = 5;
			for(int j=1 ; j<=5; j++)
			{
				if(i <= j )
					System.out.print(n--);
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}