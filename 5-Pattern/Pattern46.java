class Pattern46
{
	public static void main(String x[])
	{
		int num = 5;
		for(int i =1 ; i <= 9 ; i++)
		{			
			for(int j = 1 ; j<= 9 ;j++)
			{
				if(j == 6-i || j == 4+i)
					System.out.print(i+" ");
				else if(j == 14- i || j == i-4)
					System.out.print(num +" ");
				else
					System.out.print("  ");
				
			}
			num= (i>=5) ? --num : num;
			System.out.println();
		}
	}
}