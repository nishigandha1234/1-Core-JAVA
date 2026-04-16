//209. Minimum Size Subarray Sum
//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

class MinSizeSubArrSum
{
	public static void main(String x[])
	{
		int[] nums = {1,4,4};
		int target = 4;
		System.out.println(minSubArrayLen(target, nums));
	}
    public static int minSubArrayLen(int target, int[] nums) 
    {
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = i+1; j < nums.length ; j++)
            {
				if(nums[i] == target)
				{
					return 1;
				}
                if(nums[i]+nums[j] == target)
                {
                    int[] ans = new int[]{i,j};
                    return ans.length;
                }
            }
        }
        return 0;
    }
}