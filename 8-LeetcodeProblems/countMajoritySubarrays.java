/*3737. Count Subarrays With Majority Element I
You are given an integer array nums and an integer target.Return the number of subarrays of nums in which target is the majority element.The majority element of a subarray is the element that appears strictly more than half of the times in that subarray.
Example 1: Input: nums = [1,2,2,3], target = 2 Output: 5*/

class countMajoritySubarrays
{
	public static void main(String x[])
	{
		int[] nums = {1,2,2,3};
		int	target = 2;
		System.out.println(countMajoritySubarrays(nums,target));
	}
	public static int countMajoritySubarrays(int[] nums, int target) 
	{
		int ans = 0;
		for(int i = 0 ; i 
		for(int i = 0 ; i < nums.length ; i++)
		{
			int targetCount = 0 ;
			for(int j = i ; j < nums.length ;j++)
			{
				if(nums[i] == target)
				{
					targetCount++;
				}
				int len = j - i + 1;
				if(targetCount > len/2)
				{
					ans++;
				}
			}
		}
		return ans;
    }
}