
class Pattern42
{
	public static void main(String x[])
	{
		int n =1, rows = 5;;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1 ; j <= rows ; j++)
			{
				if(n == 9)
				{
					n=1;
				}
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
