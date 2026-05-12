/*
1
1 1
1 2	1
1 3 3 1
1 4	6 4	1
*/

class PascalRightAngle
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 6 ; i++)
		{
			int n = 1;	
			
			for(int j = 1 ; j <= 9 ; j++)
			{
				if(j <= i)
				{
					System.out.print(n+" ");
					n = n*(i-j)/j;
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