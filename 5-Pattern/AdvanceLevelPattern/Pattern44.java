/*
	#	1	#	2	#
	3	#	4	#	5
	#	6	#	7	#
	8	#	9	#	10
	#	11	#	12	# */
	
class Pattern44
{
	public static void main(String x[])
	{
		int n =1, rows = 5;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1 ; j <= rows ; j++)
			{
				
				if( (i+j) % 2==0)
					System.out.print("#" + " ");
				else
					System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}
}

