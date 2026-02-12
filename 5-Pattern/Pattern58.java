class Pattern58
{
	public static void main(String x[])
	{
		int ch = 9;
		for(int i = 1 ; i<=9 ; i++)
		{
			for(int j = 1 ; j<= 9; j++)
			{
				if(i==j || (i+j) == 10)
					System.out.print(i==j ? i : ch--);
				else 
					System.out.print(" ");
            }
			if(i==5) ch--;
			System.out.println();
		}
	}
}
