/*67 Find row sum LC 1572*/

class FindRowSum67
{
	public static void main(String x[])
	{
		int[][] ar = {
					{1,3,6},	
					{2,0,3},
					{3,4,2}
					};
		
		for(int i = 0 ; i < ar.length ; i++)
		{
			int sum = 0 ;
			for(int j = 0 ; j < ar[0].length ; j++)
			{
				sum += ar[i][j];
			}
			System.out.println("Sum : "+sum);
		}
	}
}