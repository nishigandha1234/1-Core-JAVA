/*1252. Cells with Odd Values in a Matrix
There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.For each location indices[i], do both of the following:Increment all the cells on row ri. Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
Example 1: Input: m = 2, n = 3, indices = [[0,1],[1,1]]  Output: 6*/

class CellsOddValInMatrix
{
	public static void main(String x[])
	{
		int m = 2, n = 3;
		int[][]	indices = {{0,1},{1,1}};
		System.out.println(oddCells(m,n,indices));
	}
	public static int oddCells(int m, int n, int[][] indices) 
	{
		int[][] arr = new int[m][n];
		
		for(int i = 0 ; i < indices.length ; i++)
		{
			int row = indices[i][0];
			int col = indices[i][1];
			
			for(int j=0;j<n;j++)
                arr[row][j]++;

            for(int k=0; k < m;k++)
                arr[k][col]++;
		}
		
		int count = 0;
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j <n ; j++)
			{
				if(arr[i][j] % 2 != 0)
				{
					count++;
				}
			}
		}
        return count;
    }
}