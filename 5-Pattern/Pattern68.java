class Pattern68
{
	public static void main(String x[])
	{
		for(int i = 1 ; i<=5 ; i++)
		{
			char ch = 'A';
			int num = 1;
			for(int j = 1 ; j<=5 ;j ++)
			{
				if(j<=i)
					System.out.print(ch++ + "  ");
				else
					System.out.print(num++ + "  ");				
			}
			System.out.println();
		}
	}
}