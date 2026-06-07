/*1991. Find the Middle Index in Array
Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
Example 1: Input: nums = [2,3,-1,8,4] Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4
Example 2:*/

class FindMiddleIndex1991
{
	public static void main(String x[])
	{
		int[] nums = {2,3,-1,8,4};
		System.out.println(findMiddleIndex(nums));
	}
	public static int findMiddleIndex(int[] nums) 
	{
		for(int i = 0 ; i < nums.length ; i++)
		{
			int leftSum = 0;
			int rightSum = 0;
			
			for(int j = 0 ; j < i ; j++)
				leftSum+=nums[j];
			
			for(int j = i+1 ; j < nums.length ; j++)
				rightSum += nums[j];
			
			if(leftSum == rightSum)
				return i;
		}
		return -1;
    }
}
