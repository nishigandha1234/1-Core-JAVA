/*566. Reshape the Matrix
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.*/
import java.util.*;
class ReshapetheMatrix
{
	public static void main(String x[])
	{
		int[][] mat = {{1,2},{3,4}};
		int	r = 1, c = 4;
		System.out.println(Arrays.deepToString(matrixReshape(mat, r,c)));
	}
	public static int[][] matrixReshape(int[][] mat, int r, int c) 
	{
		int m = mat.length;
		int n = mat[0].length;
		int[][] ans = new int[r][c];
		int row = 0, col = 0;
		if(m*n != r*c)
		{
			return mat;
		}
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				ans[row][col] = mat[i][j];
				col++;
				if(col == c)
				{
					row++;
					col = 0;
				}
			}
		}
		return ans;
    }
}