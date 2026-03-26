//1480. Running Sum of 1d Array
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.

import java.util.*;
import java.util.*

class RunningSumOfArray
{
	public static void main(String x[])
	{
		int[] nums = {1,1,1,1};
		int[] res = runningSum(nums);
		System.out.println(Arrays.toString(res));
	}
	public static int[] runningSum(int[] nums) 
	{
        int[] ans = new int[nums.length];
		int runningSum = 0;
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			runningSum += nums[i];
			nums[i] = runningSum;
		}
		return nums;
    }
}