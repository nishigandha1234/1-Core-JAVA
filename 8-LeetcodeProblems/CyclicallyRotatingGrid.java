/*1914. Cyclically Rotating a Grid
You are given an m x n integer matrix grid​​​, where m and n are both even integers, and an integer k.The matrix is composed of several layers, which is shown in the below image, where each color is its own layer: A cyclic rotation of the matrix is done by cyclically rotating each layer in the matrix. To cyclically rotate a layer once, each element in the layer will take the place of the adjacent element in the counter-clockwise direction. An example rotation is shown below: Return the matrix after applying k cyclic rotations to it.
Example 1: Input: grid = [[40,10],[30,20]], k = 1 Output: [[10,20],[40,30]]*/
import java.util.*;
class CyclicallyRotatingGrid
{
	public static void main(String x[])
	{
		int[][]grid = {{40,10},{30,20}};
		int	k = 1;
		int[][] ans = rotateGrid(grid, k);

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(Arrays.toString(ans[i]));
        }
	}
	public static int[][] rotateGrid(int[][] grid, int k) 
	{
          while(k > 0)
        {
            int temp = grid[0][0];

            grid[0][0] = grid[0][1];
            grid[0][1] = grid[1][1];
            grid[1][1] = grid[1][0];
            grid[1][0] = temp;

            k--;
        }
		return grid;
    }
}