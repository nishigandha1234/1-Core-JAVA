public class Pattern75
{
	public static void main(String x[])
	{
		for(int i =1 ; i <= 5 ; i++)
		{
			for (int s = 1; s <= 5 - i; s++) 
			{
                System.out.print("    ");   // 4 spaces
            }
			if(i%2 == 1) 
			{
				char ch = 'A';
				for(int j=1 ; j <= i ; j++)//for increasing
				{
					System.out.print(ch++ + "  ");
				}
				ch-=2;
				for(int j=1 ; j < i ; j++)//for decreasing
				{
					System.out.print(ch-- + "  ");
				}						
			}
			else
			{
				for(int j=1 ; j <= i ; j++) //for increasing
				{
					System.out.print(j+ "  ");
				}
				
				for(int j = i-1 ; j >=1 ; j--)//for decreasing
				{
					System.out.print(j + "  ");
				}	
			}
			System.out.println();
		}
	}
}