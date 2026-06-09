/*2161. Partition Array According to Given Pivot
You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
Example 1: Input: nums = [9,12,5,10,14,3,10], pivot = 10 Output: [9,5,3,10,10,12,14]*/

import java.util.*;	
class PartitionArray2161
{
	public static void main(String x[])
	{
		int[] nums = {9,12,5,10,14,3,10};
		int pivot = 10;
		System.out.println(Arrays.toString(pivotArray(nums, pivot)));
	}
	public static int[] pivotArray(int[] nums, int pivot) 
	{
		int[] ans = new int[nums.length];
		int k = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] < pivot)
			{
				ans[k++] = nums[i];
			}
		}
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] == pivot)
			{
				ans[k++] = nums[i];
			}
		}
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] > pivot)
			{
				ans[k++] = nums[i];
			}
		}
		return ans;
    }
}
