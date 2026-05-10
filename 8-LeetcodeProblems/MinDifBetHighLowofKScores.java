/*1984. Minimum Difference Between Highest and Lowest of K Scores
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.Return the minimum possible difference.
Example 1: Input: nums = [90], k = 1  Output: 0*/

import java.util.*;
class MinDifBetHighLowofKScores
{
	public static void main(String x[])
	{
		int[] nums = {9,4,1,7}; 
		int	k = 2;
		System.out.println(minimumDifference(nums, k));
	}
	public static int minimumDifference(int[] nums, int k) 
	{
		if(k == 1) return 0;
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i <= nums.length-k ; i++)
		{
			int diff = Math.abs(nums[i+k-1] - nums[i]);
			min = Math.min(min, diff);
		}
		return min;
    }

}