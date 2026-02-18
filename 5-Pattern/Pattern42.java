class Pattern42
{
	public static void main(String x[])
	{
		int num = 1;
		for(int i =1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j<= 5 ; j++)
			{	
				System.out.print(num++ +" ");
				if(num > 8) 
					num=1;
			}
			System.out.println();
		}
	}
}