/*
	*             *
	1 2         3 4
	* * *     * * *
	1 2 3 4 5 6 7 8
	* * * * * * * *
	1 2 3     4 5 6
	* *         * *
	1 2         3 4
	*             *
*/

class AdvanceLevelPattern5
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 8 ; i++)
		{
			int num = 1;
			for(int j = 1 ; j <= 8 ; j++)
			{
				if( ((j <= i || j >= 9-i) && ( i<=5)) || ((i>5) && ((j <= 9-i) || (j >= i))) ) 
				{
					if(i%2 == 0)
					{
						System.out.print(num++ +" ");
					}	
					else{
						System.out.print("* ");
					}
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