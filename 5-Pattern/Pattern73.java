class Pattern73
{
	public static void main(String x[])
	{
		for(int i = 1 ; i<=5 ; i++)
		{
			char ch = 'A';
			int num = 1;
			for(int j = 1 ; j<= 5 ; j++)
			{	
				if(j>=i)
				{
					if(i%2==0)
						System.out.print(num++ + " ");
					else
						System.out.print(ch++ + " ");
				}
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}