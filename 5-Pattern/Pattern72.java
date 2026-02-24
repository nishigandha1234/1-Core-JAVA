class Pattern72
{
	public static void main(String x[])
	{
		char ch1 = 'A';
		char ch2 = 'I';
		for(int i = 1 ; i<= 5 ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				if(i==j)
					System.out.print(ch1++ + " ");
				else if(j==10-i)
					System.out.print(ch2-- + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}