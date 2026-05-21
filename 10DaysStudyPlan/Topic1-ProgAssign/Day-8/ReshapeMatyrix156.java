/*156 Reshape matrix LC 566 */

import java.util.*;
class ReshapeMatyrix156
{
	public static void main(String x[])
	{
		int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
		int r = 1, c = 4;
		System.out.println(Arrays.toDeepString(reshapeMat(ar, r,
		System.out.println(Arrays.toDeepString(reshapeMat(ar, r, c)));
	}
	public static int[][] reshapeMat(int[][]ar, int r, int c)
	{
		int m = ar.length;
		int n = ar[0].length;
		int[][]ans = new int[m][n];
		int row = 0, col = 0;
		
		if(m*n != r*c)
		{
			return ar;
		}
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				ans[row][col] = ar[i][j];
				col++;
				if(col == c)
				{
					col = 0;
					row++;
				}
			}
		}
		return ans;
	}
}