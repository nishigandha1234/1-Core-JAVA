class Pattern30
{
	public static void main(String x[])
	{
		for(int i =1 ; i<= 5 ; i++)
		{
			for(int j = 1 ; j<=5 ; j++)
			{
				if(i==j || j== 6-i || i==1 || i==5 || j==1 || j==5)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}