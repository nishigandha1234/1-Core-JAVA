/*2770. Maximum Number of Jumps to Reach the Last Index
You are given a 0-indexed array nums of n integers and an integer target.You are initially positioned at index 0. In one step, you can jump from index i to any index j such that: 0 <= i < j < n -
target <= nums[j] - nums[i] <= target. Return the maximum number of jumps you can make to reach index n - 1. If there is no way to reach index n - 1, return -1.
Example 1: Input: nums = [1,3,6,4,1,2], target = 2 Output: 3 */

class MaxNumofJumpstoReachtheLastIndex
{
	public static void main(String x[])
	{
		int[] nums = {1,3,6,4,1,2};
		int	target = 2;
		System.out.println(maximumJumps(nums,target));
	}
	public static int maximumJumps(int[] nums, int target) 
	{
		int[] dp = new int[nums.length];
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			dp[i]= -1;
		}
		dp[0] = 0;
		
        for(int i = 0 ; i < nums.length ; i++)
		{
			if(dp[i] == -1) continue;
			
			for(int j = i+1; j < nums.length ; j++)
			{
				if(Math.abs(nums[j] - nums[i]) <= target)
				{
					dp[j] = Math.max(dp[j], dp[i]+1);
				}
			}
		}
		return dp[nums.length-1];
    }
}