class Pattern29
{
	public static void main(String x[])
	{
		for(int i =1 ; i<= 5 ; i++)
		{
			for(int j =1 ; j <= 5 ; j++)
			{
				if((i==j)|| (j==6-i))
					System.out.print("#"+" ");
				else
					System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}