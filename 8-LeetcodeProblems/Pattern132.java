/*456. 132 Pattern
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j]. Return true if there is a 132 pattern in nums, otherwise, return false.
Example: Input:nums = [1,2,3,4]Output:false Explanation:There is no 132 pattern in the sequence.*/

class Pattern132
{
	public static void main(String x[])
	{
		int[] nums = {3,1,4,2};
		System.out.println(find132pattern(nums));
	}
	public static boolean find132pattern(int[] nums) 
	{
        for(int i = 0 ; i < nums.length ; i++)
		{
			for(int j = i+1 ; j < nums.length ; j++)
			{
				for(int k = j+1 ; k < nums.length ; k++)
				{
					if(nums[i] < nums[k] && nums[k] < nums[j])
					{
						return true;
					}
				}
			}
		}
		return false;
    }
}