/*2770. Maximum Number of Jumps to Reach the Last Index
You are given a 0-indexed array nums of n integers and an integer target.You are initially positioned at index 0. In one step, you can jump from index i to any index j such that: 0 <= i < j < n -
target <= nums[j] - nums[i] <= target. Return the maximum number of jumps you can make to reach index n - 1. If there is no way to reach index n - 1, return -1.
Example 1: Input: nums = [1,3,6,4,1,2], target = 2 Output: 3 */

class MaxNumofJumpstoReachtheLastIndex
{
	public static void main(String x[])
	{
		int[] nums = [1,3,6,4,1,2];
		int	target = 2;
		System.out.println(maximumJumps(nums,target));
		System.out.println(maximumJumps(nums,target));
	}
	public static int maximumJumps(int[] nums, int target) 
	{
        
    }
}