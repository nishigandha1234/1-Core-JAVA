class CombinePattern
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 1 ; j <= 10; j++)
			{
				if((i >= j && i<=5) || (j <= 10-i && i>=6))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}