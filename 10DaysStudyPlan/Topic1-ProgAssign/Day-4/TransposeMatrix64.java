/*Transpose 2D Matrix*/
import java.util.*;
class TransposeMatrix64
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int[][] a = new int[3][3];
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a[0].length ; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(transpose(a)));
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