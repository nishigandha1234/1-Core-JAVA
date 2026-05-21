/*142 Search element in sorted matrix LC 74*/

import java.util.Scanner;
class Search2DMatrix142
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
		System.out.println("Enter the Target element : ");
		int target = sc.nextInt();
		System.out.print(search2D(ar,target));
	}
	public static boolean search2D(int[][]ar, int target)
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