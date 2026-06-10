/*2455. Average Value of Even Numbers That Are Divisible by Three
Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
Example 1: Input: nums = [1,3,6,10,12,15] Output: 9 Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.*/

class AvgValOfEvenNum2455
{
	public static void main(String[] args)
	{	
		int[] nums = {1,3,6,10,12,15};
		System.out.println(averageValue(nums));	
	}
	public static int averageValue(int[] nums) 
	{
		int[] ans = new int[nums.length];
		int k = 0, count = 0;
        for(int i = 0 ; i < nums.length ; i++)
		{
			if( (nums[i] % 2 == 0) && (nums[i] % 3 == 0))
			{
				ans[k++] = nums[i];
				count++;
			}
		}
		int sum = 0;
		for(int i = 0 ; i < k ; i++)
		{
			sum += ans[i];
		}
		if(count == 0) return 0;
		return sum/count;
    }
}