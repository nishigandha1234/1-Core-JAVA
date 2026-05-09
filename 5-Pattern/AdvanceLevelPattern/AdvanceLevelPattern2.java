/*
    A
   B B
  C   C
 D     D
  C   C
   B B
    A
*/

class AdvanceLevelPattern2
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 7 ; i++)
		{
			char ch = i <= 4 ? (char)('A' + i-1) : (char)('D' + 4-i) ;
			
			for(int j = 1 ; j <= 7 ; j++)
			{
				if(j == 5-i || j == 3+i && i <= 5 )
				{
					System.out.print(ch +" ");
				}
				else if((i > 4) && (j == 11-i || j == i-3))
				{
					System.out.print(ch +" ");
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