/*1572. Matrix Diagonal Sum
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.*/

import java.util.*;
class PrintDiagonalMatrix65
{
	public static void main(String[] x)
	{
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(findDiagonalOrder(mat));
	}
	public static int findDiagonalOrder(int[][] mat)
	{
		int ans = 0;
		int k = 0;
        for(int i = 0 ; i < mat.length ; i++)
		{
			for(int j = 0 ; j < mat[0].length ; j++)
			{
				if(i == j || j == mat.length -1 - i)
				{
					ans += mat[i][j] ;
				}
			}
		}
		return ans;
    }
}