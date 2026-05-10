
class PyramidTriangle
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 5; i++)
		{
			int n = 1;
			for(int j = 1 ; j <= 9 ; j++)
			{
				if(j >= 6-i && j <= 4+i)
				{
					System.out.print(n +" ");
					n = j < 5 ? ++n : --n ;
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