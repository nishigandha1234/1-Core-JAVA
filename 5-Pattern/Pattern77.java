class Pattern77
{
	public static void main(String x[])
	{
		for(int i =1 ; i <= 4 ; i++)
		{
			char ch = 'A';
			for(int j =1 ; j<= 4 ; j++)
			{
				if(i==1 || i==4 || j==1 || j==4 )
				{
					System.out.print(ch +" ");
				}
				else
				{
					System.out.print("  ");
				}
				ch++;
			}
			System.out.println();
		}
	}	
}