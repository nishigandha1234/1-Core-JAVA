class Pattern70
{
	public static void main(String x[])
	{
		char ch = 'A';
		int num =1;
		for(int i = 1 ; i <=5 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				if((i+j)%2==1)
					System.out.print(ch++ +" ");
				else
					System.out.print(num++ + " ");
			}		
			System.out.println();			
		}
	}
}