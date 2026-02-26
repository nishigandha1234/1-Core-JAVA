public class Pattern75
{
	public static void main(String x[])
	{
		for(int i =1 ; i <= 5 ; i++)
		{
			if(i%2 == 1) //for increasing
			{
				char ch = 'A';
				for(int j=1 ; j >= i ; j++)
				{
					System.out.print(ch++ + " ");
				}
				ch-=2;
				for(int j=1 ; j > i ; j++)
				{
					System.out.print(ch-- + " ");
				}						
			}
			else
			{
				int num = 1 ;
				for(int j=1 ; j <= i ; j++)
				{
					System.out.print(j+ " ");
				}
				
				for(int j=i ; j >=1 ; j--)
				{
					System.out.print(j + " ");
				}	
			}
			System.out.println();
		}
	}
}