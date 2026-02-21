class Pattern71
{
	public static void main(String x[])
	{
		int num =1 ;
		char ch = 'A';
			
		for(int i = 1 ; i<= 5 ; i++)
		{
			for(int j = 1 ; j <= 9 ; j++)
			{
				if(j >= 6-i && j <= 4+i)
				{
					if(i%2 == 0)
						System.out.print(ch++ + " ");
					else 
						System.out.print(num++ + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}