/*Transpose 2D Matrix*/

class TransposeMatrix64
{
	public static void main(String x[])
	{
		int[][] a = new int[3][3];
		System.out.println(transpose(a));
	}
	public static int[][] transpose(int[][] a)
	{
		int m = a.length;
		int n = a[0].length;
		
		int[][] ans = new int[n][m];
		
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				ans[j][i] = a[i][j];
			}
		}
		return ans;
	}
}