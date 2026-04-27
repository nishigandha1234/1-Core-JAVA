/*3190. Find Minimum Operations to Make All Elements Divisible by Three
You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
Return the minimum number of operations to make all elements of nums divisible by 3.
Example 1: Input: nums = [1,2,3,4] Output: 3*/

class MinimumOperMakeEleDiviThree
{
	public static void main(String x[])
	{
		int[] nums = {3,6,9};
		System.out.println(minimumOperations(nums));
	}
	public static int minimumOperations(int[] nums) 
	{
        int count = 0;
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] % 3 != 0)
			{
				count++;
			}
		}
		return count;
    }
}