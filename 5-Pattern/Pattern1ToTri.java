class Pattern1ToTri
{
	public static void main(String x[])
	{ 
		for(int i = 1 ; i <= 5 ; i++)
		{
			int n =1 ;
			for(int j = 1 ; j <= 5 ; j++)
			{
				int n1 = n;
				if(j <= i)
				{
					System.out.print(n++ + " ");
					
				}
				else
				{
					System.out.print("* ");
					
				}
			}
			System.out.println();
		}
	}
}