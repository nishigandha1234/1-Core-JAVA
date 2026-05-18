/*73 Check upper triangular matrix —*/

class CheckUpperTriangle73
{
	public static void main(String x[])
	{
		int[][] ar = {
					{1,2,3},	
					{4,5,6},
					{7,8,9}
					};
		
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[0].length ; j++)
			{
				if(i <= j)
				{
					System.out.print(ar[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}



}