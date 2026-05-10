
class Pattern41
{
	public static void main(String x[])
	{
		int n =1, rows = 5;;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1 ; j <= rows ; j++)
			{
				if(j <= n)
				{
					System.out.print(n+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			n = (i < ((rows+1)/2)) ? n+2 : n-2;
		}
	}
}
