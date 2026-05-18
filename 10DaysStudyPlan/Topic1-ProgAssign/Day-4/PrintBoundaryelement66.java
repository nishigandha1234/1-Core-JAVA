/*66 Print boundary elements —*/

class PrintBoundaryelement66
{
	public static void main(String x[])
	{
		int[][] arr = { {1,2,3},
		                {4,5,6},
						{7,8,9}
					  };
		printBoundaryEle(arr);		
	}
	public static void printBoundaryEle(int[][] arr)
	{
		int m = arr.length, n = arr[0].length;
		
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				if(i == 0 || i == m-1 || j == 0 || j == n-1)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
}