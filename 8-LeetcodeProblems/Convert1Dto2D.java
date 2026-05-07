/*2022. Convert 1D Array Into 2D Array
You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.
Example 1:Input: original = [1,2,3,4], m = 2, n = 2      Output: [[1,2],[3,4]]*/
import java.util.*;
class Convert1Dto2D
{
	public static void main(String x[])
	{
		int[] original = {1,2,3,4};
		int	m = 2, n = 2;
		System.out.println(Arrays.deepToString((construct2DArray(original, m , n))));
	}
	public static int[][] construct2DArray(int[] original, int m, int n) 
	{
		if(original.length != m*n)
		{
			return new int[0][0];
		}
		int[][] ans = new int[m][n];
		int k =0 ;
		
        for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				ans[i][j] = original[k++];
			}
		}
		return ans;
    }
}