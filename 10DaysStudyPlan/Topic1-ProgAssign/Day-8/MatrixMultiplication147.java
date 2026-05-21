/*147 Matrix multiplication optimization LC 311*/

class MatrixMultiplication147
{
	public static void main(String x[])
	{
		int[][] ar1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] ar2 = {{11,12,13},{14,15,16},{17,18,19}};
		
		int[][] result = multiply2D(ar1, ar2);
		for(int i = 0 ; i < ar1.length ; i++)
		{
			for(int j = 0 ; j < ar2.length ; j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] multiply2D(int[][]ar1, int[][]ar2)
	{
		int[][]ans = new int[3][3];
		int m = ar1.length;
		int n = ar2[0].length;
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				for(int k = 0 ; k < ar2.length ; k++)
				{
					ans[i][j] += ar1[i][k] * ar2[k][j];					
				}
			}
		}
		return ans;
	}
}