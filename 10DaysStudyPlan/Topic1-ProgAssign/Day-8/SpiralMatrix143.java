/*143 Matrix spiral traversal LC 54 */

import java.util.Scanner;
class SpiralMatrix143
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size  = sc.nextInt();
		int size1  = sc.nextInt();
		int[][] ar = new int[size][size1];
		System.out.println("Enter the elements in Array : ");
		for(int i = 0 ; i < size ; i++)
		{
			for(int j = 0 ; j < size1 ; j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}
		int[][] result = spiralMatrix(ar);
		
		System.out.println("Array after spiral rotation is : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			System.out.println(result[i] +" ");
		}
	}
	public static boolean spiralMatrix(int[][]ar)
	{
		boolean flag = false;
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[i].length ; j++)
			{
				if(ar[i][j] == target)
					return true;
			}
		}
		return false;
	}
}