class Pattern64
{
	public static void main(String x[])
	{
		for(int i = 5 ; i >= 1 ; i--)
		{
			char ch = (char)('A' + (i-1));
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}