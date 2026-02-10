class Pattern38
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j =1; j<=5; j++)
			{
				if(i >= j)
				{
					if(i==1) System.out.print("1"+" ");
					else if(i==2) System.out.print("2"+" ");
					else if(i==3) System.out.print("3"+" ");
					else if(i==4) System.out.print("4"+" ");
					else if(i==5) System.out.print("5"+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}