/*69 Find largest element in matrix LC 2373*/

class LargestElementMatrix69
{
	public static void main(String x[])
	{
		int[][] ar = {
					{1,2,3},	
					{4,5,6},
					{7,8,9}
					};
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[0].length ; j++)
			{
				if(ar[i][j] > max)
				{
					max = ar[i][j];
				}
			}
		}
		System.out.println("MAX : " + max);
	}
}