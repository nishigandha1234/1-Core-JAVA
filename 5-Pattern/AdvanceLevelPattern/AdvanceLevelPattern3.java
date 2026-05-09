/*
A A A A A A A
A * * * * * A
A * 1 1 1 * A
A * 1 B 1 * A
A * 1 1 1 * A
A * * * * * A
A A A A A A A
*/

class AdvanceLevelPattern3
{
	public static void main(String x[])
	{
		
		char num = '1';
		for(int i = 1 ; i <= 7 ; i++)
		{
			char ch = 'A';
			for(int j = 1 ; j <= 7 ; j++)
			{
				if(i==1 || i == 7 || j ==1 || j == 7)
				{
					System.out.print(ch +" ");
				}
				else if(i == 2 || i == 6 || j == 2 || j == 6)
				{
					System.out.print("* ");
				}
				else if(i == 3 || i == 5 || j == 3 || j == 5)
				{
					System.out.print(num+" ");
				}
				else
				{
					System.out.print("B"+ " ");
				}	
			}
			System.out.println();
		}
	}
}