class Pattern62
{
	public static void main(String x[])
	{
		for(int i = 1 ; i<=5 ; i++)
		{
			char ch = (char)('A'+(i-1));
			for(int j = 1 ; j<=5 ; j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}