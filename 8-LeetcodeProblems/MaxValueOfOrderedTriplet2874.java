/*2874. Maximum Value of an Ordered Triplet II
You are given a 0-indexed integer array nums.Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, return 0.The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
Example 1: Input: nums = [12,6,1,2,7] Output: 7 Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77 It can be shown that there are no ordered triplets of indices with a value greater than 77.*/

class MaxValueOfOrderedTriplet2874
{
	public static void main(String x[])
	{
		int[]nums = {12,6,1,2,7};
		System.out.println(maximumTripletValue(nums));
	}
	public static long maximumTripletValue(int[] nums) 
	{
		long[] leftMax = new long[nums.length];
		long[] rightMax = new long[nums.length];
			
		leftMax[0] = nums[0];
		for(int i = 1 ; i < nums.length ; i++)
		{
			leftMax[i] = Math.max(leftMax[i-1], nums[i]);
		}
		rightMax[nums.length-1] = nums[nums.length-1];
		for(int i = nums.length-2 ; i >= 0; i--)
		{
			rightMax[i] = Math.max(rightMax[i+1], nums[i]);
		}
		long ans = 0;
		for(int j =1 ; j < nums.length-1 ; j++)
		{
			long value = (leftMax[j-1] - nums[j])*rightMax[j+1];
			ans = Math.max(value,ans);
		}
		return ans;
	}
}




