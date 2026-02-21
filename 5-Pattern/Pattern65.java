class Pattern65
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			
			for(int j = 1 ; j <= 5 ; j++)
			{
				char ch = (char)('A' + (5-j));
				if(j>=6-i)
					System.out.print(ch +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}