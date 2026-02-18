class Pattern48 //half run 
{
	public static void main(String x[])
	{
		int num = 4;
		for(int i = 1 ; i <= 7 ; i++)
		{
			for(int j = 1 ; j <= 7 ; j++)
			{
				if(j <= i && i <= 4 )
				{
					if(j%2==0)
					{
						System.out.print("*"+" ");					
					}
					else
					{
						if(j <= i && i <= 5)
						{
							System.out.print(i + " ");
						}
					}
				}
				else
				{
					if(j >= 8-i && i >=5)
					{
						if((j + i) % 2 == 0)
							System.out.print(num + " ");
						else
							System.out.print("* ");
					}
				}
			}		
			num = i >= 4 ? num-1 : num;
			System.out.println();
		}			
	}
}