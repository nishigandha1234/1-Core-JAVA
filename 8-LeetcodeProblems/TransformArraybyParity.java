/*3467. Transform Array by Parity
You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:Replace each even number with 0. Replace each odd numbers with 1.Sort the modified array in non-decreasing order.
Return the resulting array after performing these operations.
Example 1: Input: nums = [4,3,2,1] Output: [0,0,1,1]*/

import java.util.*;

class TransformArraybyParity
{
	public static void main(String x[])
	{
		int[] nums = {4,3,2,1};
		System.out.println(Arrays.toString(transformArray(nums)));
	}
	public static int[] transformArray(int[] nums) 
	{
        for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] % 2 == 0)
			{
				nums[i] = 0;
			}
			else
			{
				nums[i] = 1;
			}
		}
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			for(int j = i+1 ; j< nums.length ;j++)
			{
				if(nums[i] > nums[j])
				{
					int temp = nums[i] ;
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		return nums;
    }
}