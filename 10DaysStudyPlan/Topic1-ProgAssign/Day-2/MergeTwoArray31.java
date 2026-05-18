/*31 Merge two arrays*/

import java.util.*;
class MergeTwoArray31
{
	public static void main(String x[])
	{
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int	m = 3, n = 3;
		merge(nums1,m,nums2,n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n)
	{
		int k = m+n, s = 0;
		int[] ans = new int[k];
		for(int i = 0 ; i < m; i++)
		{
			ans[s++] = nums1[i];
		}
		for(int i = 0 ; i < n ; i++)
		{
			ans[s++] = nums2[i];
		}
		Arrays.sort(ans);
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i]+ " ");
		}
	}
}