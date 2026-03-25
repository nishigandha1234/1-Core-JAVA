//560. Subarray Sum Equals K
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k. A subarray is a contiguous non-empty sequence of elements within an array.

class SubArraySumEqualstoK
{
	public static void main(String x[])
	{
		int[] nums = {1,2,3,4,5};
		int k = 5;
		System.out.println(subarraySum(nums, k));
	}
	public static int subarraySum(int[] nums, int k) 
	{
		int count = 0;
		int n = nums.length;
		
        for(int i = 0 ; i < (n-k) ; i++)
		{
			int sum = 0;
			for(int j = i ; j < (i+k) ; j++)
			{
				sum += nums[j];
				if(sum == k)
				{
					count+
				}
			}
		}
		return count;
    }
}