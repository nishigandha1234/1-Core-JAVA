/*3689. Maximum Total Subarray Value I
You are given an integer array nums of length n and an integer k.You need to choose exactly k non-empty subarrays nums[l..r] of nums. Subarrays may overlap, and the exact same subarray (same l and r) can be chosen more than once.The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).The total value is the sum of the values of all chosen subarrays.Return the maximum possible total value you can achieve.
Example 1: Input: nums = [1,3,2], k = 2 Output: 4*/

class MaxTotalSubarray3689
{
	public static void main(String x[])
	{
		int[] nums = {1,3,2};
		int	k = 2;
		System.out.println(maxTotalValue(nums,k));
	}
	public static long maxTotalValue(int[] nums, int k) 
	{	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < nums.length ; i++)
		{
			max = Math.max(nums[i], max);
			min = Math.min(nums[i], min);
		}
		long ans = (long)(max-min)*k;
		return ans;
    }
}