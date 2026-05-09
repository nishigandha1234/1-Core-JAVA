/*
	*      *
	**    **
	***  ***
	********
	********
	***  ***
	**    **
	*      *
*/

class AdvanceLevelPattern1
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 8 ; i++)
		{
			for(int j = 1 ; j <= 8 ; j++)
			{
				if( ((j <= i || j >= 9-i) && ( i<=5)) || ((i>5) && ((j <= 9-i) || (j >= i))) ) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}