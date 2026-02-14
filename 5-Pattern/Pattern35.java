class Pattern35
{
	public static void main(String x[])
	{
		int n1=5;
		
		for(int i=1 ; i<=5 ; i++)
		{   
			int n=n1;
			for(int j=1 ; j<=5; j++)
			{
				if(i<=j)
					System.out.print(n--);
				
				else
					System.out.print(" ");
			}
			System.out.println();
			
			n1--;
		}
	}
}