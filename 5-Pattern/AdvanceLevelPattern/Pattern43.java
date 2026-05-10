/*
	1	2	3	4	5
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5
*/

class Pattern43
{
	public static void main(String x[])
	{
		int n =1, rows = 5;;
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1 ; j <= rows ; j++)
			{
				if(j <= i)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
				n++;
			}
			System.out.println();
		}
	}
}
