class Pattern75
{
	public static void main(String x[])
	{int rows = 5;

		for(int i = 1; i <= rows; i++)
		{
			char ch = 'A';
			int num = 1;

			for(int s = 1; s <= rows - i; s++)
			{
				System.out.print(" ");
			}

			for(int j = 1; j <= i; j++)
			{
				if(i % 2 != 0)
					System.out.print(ch++ + " ");
				else
					System.out.print(num++ + " ");
			}

			if(i % 2 != 0)
				ch -= 2;
			else
				num -= 2;

			for(int j = 1; j < i; j++)
			{
				if(i % 2 != 0)
					System.out.print(ch-- + " ");
				else
					System.out.print(num-- + " ");
			}

			System.out.println();
		}
	}
}