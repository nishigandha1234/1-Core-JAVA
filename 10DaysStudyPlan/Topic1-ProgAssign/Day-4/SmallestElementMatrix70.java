/*70 Find smallest element in matrix LC 378*/

class SmallestElementMatrix70
{
	public static void main(String x[])
	{
		int[][] ar = {
					{1,2,3},	
					{4,5,6},
					{7,8,9}
					};
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[0].length ; j++)
			{
				if(ar[i][j] < min)
				{
					min = ar[i][j];
				}
			}
		}
		System.out.println("MIN : " + min);
	}
}