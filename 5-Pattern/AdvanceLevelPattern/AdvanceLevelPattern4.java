/*
    1
   A A
  2   2
 B     B
  2   2
   A A
    1
*/

class AdvanceLevelPattern4
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 7 ; i++)
		{
			char num = '1';
			char ch = (i%2==0) ? (i <= 4 ? (char)('A' + (i-2)/2) : (char)('A' + (6-i)/2) ) : (i <= 4)?(char)('1'+(i-1)/2):(char)('1'+(7-i)/2) ;
			
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