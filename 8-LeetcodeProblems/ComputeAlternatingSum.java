/*3701. Compute Alternating Sum
You are given an integer array nums.The alternating sum of nums is the value obtained by adding elements at even indices and subtracting elements at odd indices. That is, nums[0] - nums[1] + nums[2] - nums[3]...
Return an integer denoting the alternating sum of nums.
Example 1: Input: nums = [1,3,5,7] Output: -4*/

class ComputeAlternatingSum
{
	public static void main(String x[])
	{
		int[] nums = {1,3,5,7};
		System.out.println(alternatingSum(nums));
	}
	public static int alternatingSum(int[] nums) 
    {
        int ans = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
			if(i%2 == 0)
			{
				ans += nums[i];
			}
			else
			{
				ans -= nums[i];
			}
        }
		return ans;
    }
}