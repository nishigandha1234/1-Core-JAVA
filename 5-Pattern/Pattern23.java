class Pattern23
{
	public static void main(String[] args)
	{
		for(int i = 1 ; i <= 9 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				if((j <= i && i<=5) || (j <= 10-i && i>5))
				{
					if(j==1 || j==3 || j==5)
						System.out.print("# ");
					else 
						System.out.print("* ");
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